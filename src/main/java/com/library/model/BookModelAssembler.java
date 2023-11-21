package com.library.model;

import org.springframework.beans.BeanUtils;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.stereotype.Component;

import com.library.controller.BookController;
import com.library.entities.Book;

@Component
public class BookModelAssembler extends RepresentationModelAssemblerSupport<Book, BookModel> {

	public BookModelAssembler() {
		super(BookController.class, BookModel.class);
	}

	@Override
	public BookModel toModel(Book entity) {
		BookModel bookModel = new BookModel();
		BeanUtils.copyProperties(entity, bookModel);
		return bookModel;
	}

}
