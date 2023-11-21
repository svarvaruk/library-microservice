package com.library.model;

import org.springframework.beans.BeanUtils;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.stereotype.Component;

import com.library.controller.AuthorController;
import com.library.entities.Author;

@Component
public class AuthorModelAssembler extends RepresentationModelAssemblerSupport<Author, AuthorModel> {

	public AuthorModelAssembler() {
		super(AuthorController.class, AuthorModel.class);
	}

	@Override
	public AuthorModel toModel(Author entity) {
		AuthorModel authorModel = new AuthorModel();
		BeanUtils.copyProperties(entity, authorModel);
		return authorModel;
	}

}
