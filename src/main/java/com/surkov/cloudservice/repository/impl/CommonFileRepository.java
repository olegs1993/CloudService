package com.surkov.cloudservice.repository.impl;

import com.surkov.cloudservice.model.File;
import com.surkov.cloudservice.repository.FileRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class CommonFileRepository implements FileRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public File findById(Long fileId) {
        return entityManager.find(File.class, fileId);
    }
}
