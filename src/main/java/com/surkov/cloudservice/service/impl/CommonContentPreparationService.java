package com.surkov.cloudservice.service.impl;

import com.surkov.cloudservice.converter.FileMapper;
import com.surkov.cloudservice.converter.FolderMapper;
import com.surkov.cloudservice.dto.ContentOutputDtoList;
import com.surkov.cloudservice.model.Folder;
import com.surkov.cloudservice.repository.FolderRepository;
import com.surkov.cloudservice.service.ContentPreparationService;
import com.surkov.cloudservice.service.FileService;
import com.surkov.cloudservice.service.FolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CommonContentPreparationService implements ContentPreparationService {
    @Autowired
    FolderService folderService;
    @Autowired
    FolderHelper folderHelper;
    @Autowired
    FileHelper fileHelper;

    @Override
    @Transactional
    public ContentOutputDtoList prepareContent(Long folderId) {
        Folder folder = folderService.getFolder(folderId);
        ContentOutputDtoList contentOutputDtoList = new ContentOutputDtoList();
        contentOutputDtoList.setFolderOutputDtoList(folderHelper.prepareFolderDtoList(folder));
        contentOutputDtoList.setFileOutputDtoList(fileHelper.prepareFileDtoList(folder));
        return contentOutputDtoList;
    }
}
