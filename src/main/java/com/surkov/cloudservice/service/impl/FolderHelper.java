package com.surkov.cloudservice.service.impl;

import com.surkov.cloudservice.converter.FolderMapper;
import com.surkov.cloudservice.dto.FolderOutputDto;
import com.surkov.cloudservice.model.Folder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FolderHelper {

    @Autowired
    FolderMapper folderMapper;

    List<FolderOutputDto> prepareFolderDtoList(Folder folder) {
        return folder.getFolderList().stream()
                .map(folderMapper::toFolderOutputDto)
                .collect(Collectors.toList());
    }
}
