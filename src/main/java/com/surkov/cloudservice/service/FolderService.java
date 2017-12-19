package com.surkov.cloudservice.service;

import com.surkov.cloudservice.dto.FolderOutputDto;
import com.surkov.cloudservice.dto.FolderParamDto;
import com.surkov.cloudservice.dto.ListFolderOutputDto;

public interface FolderService {

    ListFolderOutputDto getFolder(Long folderId);

    void createFolder(Long parentId, FolderParamDto folderParamDto);

    void deleteFolder(Long id);
}
