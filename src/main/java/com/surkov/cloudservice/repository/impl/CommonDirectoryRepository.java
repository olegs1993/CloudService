package com.surkov.cloudservice.repository.impl;

import com.surkov.cloudservice.model.Directory;
import com.surkov.cloudservice.repository.DirectoryRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class CommonDirectoryRepository implements DirectoryRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Directory findDirectory(Long id) {
        return entityManager.find(Directory.class, id);
    }

    @Override
    public void delete(Directory directory) {
        entityManager.remove(directory);
    }

    @Override
    public void save(Directory directory) {
        entityManager.persist(directory);
    }
}
