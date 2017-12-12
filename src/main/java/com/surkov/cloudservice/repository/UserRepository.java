package com.surkov.cloudservice.repository;

import com.surkov.cloudservice.model.User;

public interface UserRepository {

    User findUser(Long id);

    void delete(User user);

    void save(User user);

}
