package com.adham.database.services;

import com.adham.database.domain.entities.AuthorEntity;

import java.util.List;

public interface AuthorService {
    AuthorEntity save(AuthorEntity authorEntity);

    List<AuthorEntity> findAll();
}
