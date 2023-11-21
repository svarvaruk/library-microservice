package com.library.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.library.entities.Author;
import com.library.exception.AuthorNotFoundException;
import com.library.repositories.AuthorRepository;
import com.library.utils.BookHelper;

@Service
public class AuthorService {
	AuthorRepository authorRepository;
	
	@Value(("${top:0}"))
	int topDefaultValue;
	
	@Value(("${size:10}"))
	int sizeDefaultValue;	
	
	@Value(("${sizemax:200}"))
	int sizeMaxValue;	

	public AuthorService(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
	}

	public Author getAuthor(String id) {
		return authorRepository.findById(id).orElseThrow(() -> new AuthorNotFoundException(id));
	}
	
	public Page<Author> getAuthorsList(Integer page, Integer size) {
		//Sort sort = new Sort(new Sort.Order(Direction.ASC, "lastName"));
		Pageable authorsPage = PageRequest.of(BookHelper.getPageNumberValue(page, topDefaultValue),
				BookHelper.getPageSizeValue(size, sizeDefaultValue));
		return authorRepository.findAll(authorsPage);
	}
	
	public Page<Author> getAuthorsListByLastName(Integer page, Integer size, String lastName) {
		//Sort sort = new Sort(new Sort.Order(Direction.ASC, "lastName"));
		Pageable authorsPage = PageRequest.of(BookHelper.getPageNumberValue(page, topDefaultValue),
				BookHelper.getPageSizeValue(size, sizeDefaultValue));
		return authorRepository.findByLastName(lastName, authorsPage);
	}	
	
	public void deleteAuthor(String id) {
		authorRepository.deleteById(id);
	}
	
	public Author addAuthor(Author author) {
		return authorRepository.save(author);
	}
	
	public Author updateAuthor(Author author) {
		return authorRepository.save(author);
	}	
}
