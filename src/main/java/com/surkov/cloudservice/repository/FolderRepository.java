package com.surkov.cloudservice.repository;

import com.surkov.cloudservice.model.Folder;


public interface FolderRepository {

    Folder findFolder(Long id);

    void save (Folder folder);

    void delete(Folder folder);

}
