package com.groupproject.services;

import com.groupproject.entities.Author;
import com.groupproject.requests.AuthorRequest;

import java.util.List;

public interface IAuthorService {

    // list of all authors
    List<Author> getAll();
    // get author by id
    Author getAuthorById(Long id);
    // create new author
    boolean newAuthor(AuthorRequest request);
    // delete author by id
    boolean deleteAuthor(Long id);
    // update an existing author(i dont think is needed)
}
