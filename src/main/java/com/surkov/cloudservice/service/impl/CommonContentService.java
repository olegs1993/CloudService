package com.surkov.cloudservice.service.impl;

import com.surkov.cloudservice.dto.ContentOutputDtoList;
import com.surkov.cloudservice.dto.FolderInputDto;
import com.surkov.cloudservice.model.Folder;
import com.surkov.cloudservice.service.ContentService;
import com.surkov.cloudservice.service.FileService;
import com.surkov.cloudservice.service.FolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CommonContentService implements ContentService {

    @Autowired
    private FolderService folderService;
    @Autowired
    private FolderHelper folderHelper;
    @Autowired
    private FileHelper fileHelper;
    @Autowired
    private FileService fileService;

    @Override
    @Transactional
    public ContentOutputDtoList prepareContent(Long folderId) {
        Folder folder = folderService.getFolder(folderId);
        ContentOutputDtoList contentOutputDtoList = new ContentOutputDtoList();
        contentOutputDtoList.setFolderOutputDtoList(folderHelper.prepareFolderDtoList(folder));
        contentOutputDtoList.setFileOutputDtoList(fileHelper.prepareFileDtoList(folder));
        return contentOutputDtoList;
    }

    @Override
    @Transactional
    public void deleteFolder(Long folderId) {
        folderService.deleteFolder(folderId);
    }

    @Override
    public void createFolder(FolderInputDto folderInputDto) {
        folderService.createFolder(folderInputDto);

    }

    @Override
    @Transactional
    public FileSystemResource downloadFile(Long fileId) {
        return fileService.readFile(fileId);
    }


}
