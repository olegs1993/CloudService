package com.surkov.cloudservice.service;


import com.surkov.cloudservice.dto.ContentOutputDtoList;
import com.surkov.cloudservice.dto.FolderInputDto;

public interface ContentService {

    ContentOutputDtoList prepareContent(Long folderId);

    void deleteFolder(Long folderId);

    void createFolder(FolderInputDto folderInputDto);
}
