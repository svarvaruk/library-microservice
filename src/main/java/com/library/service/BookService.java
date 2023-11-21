package com.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.library.entities.Author;
import com.library.entities.Book;
import com.library.exception.BookNotFoundException;
import com.library.repositories.BookRepository;
import com.library.utils.BookHelper;

@Service
public class BookService {
	
	private BookRepository bookRepository;

	@Value(("${top:0}"))
	int pageNumberDefaultValue;
	
	@Value(("${size:10}"))
	int pageSizeDefaultValue;	
	
	@Value(("${sizemax:200}"))
	int sizeMaxValue;
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	public Book getBook(String id) {
		return bookRepository.findById(id).orElseThrow(() -> new BookNotFoundException(id));
	}
	
	public Page<Book> getBooksByIsbn(Integer pageNumber, Integer pageSize, String isbn) {
		Pageable page = PageRequest.of(BookHelper.getPageNumberValue(pageNumber, pageNumberDefaultValue),
				BookHelper.getPageSizeValue(pageSize, pageSizeDefaultValue));		
		return bookRepository.findByIsbn(isbn, page);
	}	
	
	public Page<Book> getBooksByTitle(Integer pageNumber, Integer pageSize, String title) {
		Pageable page = PageRequest.of(BookHelper.getPageNumberValue(pageNumber, pageNumberDefaultValue),
				BookHelper.getPageSizeValue(pageSize, pageSizeDefaultValue));		
		return bookRepository.findByTitle(title, page);
	}
	
	public Page<Book> getBooksByAuthor(Integer pageNumber, Integer pageSize, List<Author> authors) {
		Pageable page = PageRequest.of(BookHelper.getPageNumberValue(pageNumber, pageNumberDefaultValue),
				BookHelper.getPageSizeValue(pageSize, pageSizeDefaultValue));		
		return bookRepository.findAllByAuthorsIn(authors, page);
	}	
	
	public Book addBook(Book book) {
		return bookRepository.save(book);
	}
}
