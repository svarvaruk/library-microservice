package com.library.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Optional;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.test.context.junit4.SpringRunner;

import com.library.entities.Author;
import com.library.entities.AuthorBuilder;
import com.library.repositories.AuthorRepository;

@RunWith(SpringRunner.class)
public class AuthorServiceTest {
	
    @Mock
    AuthorRepository authorRepository;
    
    @InjectMocks
    AuthorService authorService;
    
    @BeforeEach
    public void setup() {

    }
    
    @Test
    public void testGetAuthorsList() {
		Author author = new AuthorBuilder()
				.setId("test-generated-id")
				.setFirstName("test-generated-FirstName")
				.setLastName("test-generated-LastName")
				.setMiddleName("test-generated-MiddleName")
				.setUrl("test-generated-Url")
				.setExId("test-generated-ExtId")
				.setHubId("test-generated-hubId")
				.setNickname("test-generated-NickName")
				.setLvl(1)
				.setRelation(1)
				.setSubjectId(1)
				.build();
		
		when(authorRepository.findByLastName("test-generated-LastName", null)).thenReturn(new PageImpl<>(Arrays.asList(author)));
		
        Page<Author> authorList;
        
        Mockito.when(authorService.getAuthorsListByLastName(1, 10, "test-generated-LastName")).thenReturn(authorList = new PageImpl<>(Arrays.asList(author)));
        
        assertNotEquals(authorList, null);
        assertFalse(authorList.isEmpty());
        assertEquals("test-generated-FirstName", authorList.getContent().get(0).getFirstName());
        assertEquals("test-generated-LastName", authorList.getContent().get(0).getLastName());                
    } 
    
    @Test
    public void testGetAuthorById() {
		Author author = new AuthorBuilder()
				.setId("test-generated-id")
				.setFirstName("test-generated-FirstName")
				.setLastName("test-generated-LastName")
				.setMiddleName("test-generated-MiddleName")
				.setUrl("test-generated-Url")
				.setExId("test-generated-ExtId")
				.setHubId("test-generated-hubId")
				.setNickname("test-generated-NickName")
				.setLvl(1)
				.setRelation(1)
				.setSubjectId(1)
				.build();
        when(authorRepository.findById("test-generated-id")).thenReturn(Optional.of(author));
        Author authorById = authorService.getAuthor("test-generated-id");
        assertNotEquals(authorById, null);
        assertEquals("test-generated-FirstName", authorById.getFirstName());
        assertEquals("test-generated-LastName", authorById.getLastName());
    }    
}
