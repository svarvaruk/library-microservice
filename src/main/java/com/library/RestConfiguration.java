package com.library;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.library.entities.Author;
import com.library.entities.Book;

@Configuration
public class RestConfiguration implements RepositoryRestConfigurer  {
    
	@Override
    public void configureRepositoryRestConfiguration(
      RepositoryRestConfiguration restConfiguration, CorsRegistry corsRegistry) {
        restConfiguration.exposeIdsFor(Author.class);
        restConfiguration.exposeIdsFor(Book.class);
    }
}