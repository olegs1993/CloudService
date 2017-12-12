package com.surkov.cloudservice.repository;

import com.surkov.cloudservice.model.Directory;

public interface DirectoryRepository {

    Directory findDirectory(Long id);

    void delete(Directory directory);

    void save(Directory directory);

}
