package com.adham.database.controllers;

import com.adham.database.domain.dto.AuthorDto;
import com.adham.database.domain.entities.AuthorEntity;
import com.adham.database.mappers.Mapper;
import com.adham.database.services.AuthorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {

    private AuthorService authorService;

    private Mapper<AuthorEntity, AuthorDto> authorMapper;

    public AuthorController(AuthorService authorService, Mapper<AuthorEntity, AuthorDto> authorMapper) {
        this.authorService = authorService;
        this.authorMapper = authorMapper;
    }

    @PostMapping(path = "/authors")
    public ResponseEntity<AuthorDto> createAuthor(@RequestBody AuthorDto author) {
        AuthorEntity authorEntity = authorMapper.mapFrom(author);
        AuthorEntity savedAuthorEntity = authorService.save(authorEntity);
        return new ResponseEntity<>(authorMapper.mapTo(savedAuthorEntity), HttpStatus.CREATED);
    }
}
