package com.library.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.library.entities.Author;

public interface AuthorRepository extends PagingAndSortingRepository <Author, String>{

	Page<Author> findByLastName(String title, Pageable pageable);
}
