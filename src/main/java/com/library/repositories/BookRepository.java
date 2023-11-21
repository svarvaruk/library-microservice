package com.library.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.library.entities.Author;
import com.library.entities.Book;

public interface BookRepository extends PagingAndSortingRepository<Book, String>{
	Page<Book> findByTitle(String title, Pageable pageable);
	Page<Book> findByIsbn(String isbn, Pageable pageable);
	Page<Book> findAllByAuthorsIn(List<Author> authors, Pageable pageable);
}
