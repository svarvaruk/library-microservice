package com.library.controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.PagedModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.library.entities.Author;
import com.library.model.AuthorModel;
import com.library.model.AuthorModelAssembler;
import com.library.service.AuthorService;
import com.library.utils.BookHelper;

@RestController
public class AuthorController {
	
	public static final Logger log =  LoggerFactory.getLogger(AuthorController.class);
	
	private AuthorService authorService;
	private AuthorModelAssembler authorModelAssembler;
	private PagedResourcesAssembler<Author> pagedResourcesAssembler;	
	
	public AuthorController(AuthorService authorService, 
			AuthorModelAssembler authorModelAssembler,
			PagedResourcesAssembler<Author> pagedResourcesAssembler) {
		this.authorService = authorService;
		this.authorModelAssembler = authorModelAssembler;
		this.pagedResourcesAssembler = pagedResourcesAssembler;
	}

	@DeleteMapping("/api/authors/{id}")
	ResponseEntity<Author> deleteAuthor(@PathVariable String id) {
		authorService.deleteAuthor(id);
		return ResponseEntity.noContent().build();
	}
	
	@PostMapping("/api/authors")
	@ResponseStatus(HttpStatus.CREATED)
	public EntityModel<Author> addAuthor(@RequestBody @Validated AuthorModel authorModel) {
		Author author = new Author(authorModel);
		author = authorService.addAuthor(author);
		return EntityModel.of(author,
			      linkTo(methodOn(AuthorController.class).getAuthor(author.getId())).withSelfRel());
	}
	
	@PutMapping("/api/authors")
	@ResponseStatus(HttpStatus.OK)
	public EntityModel<Author> overriteAuthor(@RequestBody @Validated AuthorModel authorModel) {
		validateAuthor(authorModel.getId());
		Author author = authorService.updateAuthor(new Author(authorModel));
		return EntityModel.of(author,
			      linkTo(methodOn(AuthorController.class).getAuthor(author.getId())).withSelfRel());
	}
	
	@PatchMapping("/api/authors")
	@ResponseStatus(HttpStatus.OK)
	public EntityModel<Author> updateAuthor(@RequestBody @Validated AuthorModel authorModel) {
		Author existingAuthor = validateAuthor(authorModel.getId());
		Author author = authorService.updateAuthor(BookHelper.deltaAuthor(existingAuthor, new Author(authorModel)));
		return EntityModel.of(author,
			      linkTo(methodOn(AuthorController.class).getAuthor(author.getId())).withSelfRel());
	}
	
	@GetMapping("/api/authors/{id}")
	EntityModel<Author> getAuthor(@PathVariable String id) {

	  Author author = authorService.getAuthor(id);

	  return EntityModel.of(author,
	      linkTo(methodOn(AuthorController.class).getAuthor(id)).withSelfRel());
	}	

    @GetMapping("/api/authors")
    public PagedModel<AuthorModel> getAuthorsWithPaginationByLastName(
            @RequestParam(required = false) Integer page,
            @RequestParam(required = false) Integer size,
            @RequestParam(required = false) String lastName) {
    	Page<Author> authors = null;
		if(lastName != null && !lastName.isBlank()) {
			log.info("Last Name has been provided: {}", lastName);    	
			authors = authorService.getAuthorsListByLastName(page, size, lastName);
		} else {
			authors=authorService.getAuthorsList(page, size);
		}
        return pagedResourcesAssembler.toModel(authors, authorModelAssembler);
    }
    
    private Author validateAuthor(String id) {
    	return authorService.getAuthor(id);
    }
    


}
