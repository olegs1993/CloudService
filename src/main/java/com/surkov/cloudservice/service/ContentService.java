package com.surkov.cloudservice.service;


import com.surkov.cloudservice.dto.ContentOutputDtoList;
import com.surkov.cloudservice.dto.FolderInputDto;
import org.springframework.core.io.FileSystemResource;

public interface ContentService {

    ContentOutputDtoList prepareContent(Long folderId);

    void deleteFolder(Long folderId);

    void createFolder(FolderInputDto folderInputDto);

    FileSystemResource downloadFile(Long fileId);

}
