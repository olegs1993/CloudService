package com.surkov.cloudservice.service.impl;

import com.surkov.cloudservice.dto.FolderInputDto;
import com.surkov.cloudservice.model.Folder;
import com.surkov.cloudservice.repository.FolderRepository;
import com.surkov.cloudservice.service.FolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CommonFolderService implements FolderService {

    @Autowired
    private FolderRepository folderRepository;


    @Override

    public Folder getFolder(Long folderId) {
        return folderRepository.findFolder(folderId);
    }

    @Override
    public void createFolder(FolderInputDto folderInputDto) {

    }

    @Override
    public void deleteFolder(Long folderId) {
        Folder folder = folderRepository.findFolder(folderId);
        folderRepository.delete(folder);

    }
}
