package com.surkov.cloudservice.repository.impl;

import com.surkov.cloudservice.model.Folder;
import com.surkov.cloudservice.repository.FolderRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class CommonFolderRepository implements FolderRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Folder findFolder(Long id) {
        return entityManager.find(Folder.class, id);
    }

    @Override
    public void save(Folder folder) {
        entityManager.persist(folder);
    }

    @Override
    public void delete(Folder folder) {
        entityManager.remove(folder);
    }
}
