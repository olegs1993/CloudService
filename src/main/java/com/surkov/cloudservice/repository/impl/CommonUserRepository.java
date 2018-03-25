package com.surkov.cloudservice.repository.impl;

import com.surkov.cloudservice.model.User;
import com.surkov.cloudservice.repository.UserRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class CommonUserRepository implements UserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User findUser(Long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void delete(User user) {
        entityManager.remove(user);
    }

    @Override
    public void save(User user) {
        entityManager.persist(user);
    }
}
