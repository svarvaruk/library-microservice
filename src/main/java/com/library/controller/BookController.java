package com.library.controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import org.springframework.data.domain.Page;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.PagedModel;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.library.entities.Author;
import com.library.entities.Book;
import com.library.model.BookModel;
import com.library.model.BookModelAssembler;
import com.library.service.AuthorService;
import com.library.service.BookService;
import com.library.utils.BookHelper;

@RestController
public class BookController {
	
	private BookService bookService;
	private AuthorService authorService;
	private BookModelAssembler bookModelAssembler;
	private PagedResourcesAssembler<Book> pagedResourcesAssembler;
	
	public BookController(BookService bookService,
			AuthorService authorService,
			BookModelAssembler bookModelAssembler,
			PagedResourcesAssembler<Book> pagedResourcesAssembler) {
		this.bookService = bookService;
		this.authorService = authorService;
		this.bookModelAssembler = bookModelAssembler;
		this.pagedResourcesAssembler = pagedResourcesAssembler;
	}

	@PostMapping("/api/books")
	EntityModel<Book> addBook(@RequestBody @Validated BookModel bookModel) {
		Book book = new Book(bookModel);
		book = bookService.addBook(book);
		return EntityModel.of(book,
			      linkTo(methodOn(BookController.class).getBook(book.getId())).withSelfRel());		
	}
	
	@PutMapping("/api/books")
	EntityModel<Book> overrideBook(@RequestBody @Validated BookModel bookModel) {
		validateBook(bookModel.getId());
		Book book = bookService.addBook(new Book(bookModel));
		return EntityModel.of(book,
			      linkTo(methodOn(BookController.class).getBook(book.getId())).withSelfRel());		
	}
	
	@PatchMapping("/api/books")
	EntityModel<Book> updateBook(@RequestBody @Validated BookModel bookModel) {
		Book existingBook = validateBook(bookModel.getId());
		Book book = bookService.addBook(BookHelper.deltaBook(existingBook, new Book(bookModel)));
		return EntityModel.of(book,
			      linkTo(methodOn(BookController.class).getBook(book.getId())).withSelfRel());		
	}
	
	@GetMapping("/api/books/{id}")
	EntityModel<Book> getBook(@PathVariable String id) {

		  Book book = bookService.getBook(id);

		  return EntityModel.of(book,
		      linkTo(methodOn(BookController.class).getBook(id)).withSelfRel());
	}	
	
	@GetMapping("/api/books")
	public PagedModel<BookModel> getBooks(@RequestParam(required = false) Integer page,
            @RequestParam(required = false) Integer size,
            @RequestParam(required = false) String title,
            @RequestParam(required = false) String isbn,
            @RequestParam(required = false) String authorLastName) {

		Page<Book> books = null;

		if(title != null && !title.isBlank()) {
			books = bookService.getBooksByTitle(page, size, title);
		} else if(isbn != null && !isbn.isBlank()) {
			books = bookService.getBooksByIsbn(page, size, isbn);
		} else if(authorLastName != null && !authorLastName.isBlank()) {
			Page<Author> authors = authorService.getAuthorsListByLastName(page, size, authorLastName);
			if(authors != null && !authors.isEmpty()) {
				books = bookService.getBooksByAuthor(page, size, authors.getContent());
			}
		}
		
		return pagedResourcesAssembler.toModel(books, bookModelAssembler);
	}	
		
	private Book validateBook(String id) {
		return bookService.getBook(id);
	}

}
