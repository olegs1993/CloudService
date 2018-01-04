package com.surkov.cloudservice.service;


import com.surkov.cloudservice.dto.FolderInputDto;
import com.surkov.cloudservice.dto.FolderOutputDto;
import com.surkov.cloudservice.model.Folder;

import java.util.List;

public interface FolderService {

    Folder getFolder(Long folderId);

    void createFolder(FolderInputDto folderParamDto);

    void deleteFolder(Long id);
}
