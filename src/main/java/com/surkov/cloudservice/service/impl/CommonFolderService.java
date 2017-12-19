package com.surkov.cloudservice.service.impl;

import com.surkov.cloudservice.converter.FolderMapper;
import com.surkov.cloudservice.dto.FolderOutputDto;
import com.surkov.cloudservice.dto.FolderParamDto;
import com.surkov.cloudservice.dto.ListFolderOutputDto;
import com.surkov.cloudservice.model.Folder;
import com.surkov.cloudservice.repository.FolderRepository;
import com.surkov.cloudservice.service.FolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.stream.Collectors;

@Service
public class CommonFolderService implements FolderService {

    @Autowired
    private FolderRepository folderRepository;
    @Autowired
    private FolderMapper folderMapper;

    @Override
    @Transactional(readOnly = true)
    public ListFolderOutputDto getFolder(Long folderId) {
        Folder folder = folderRepository.findFolder(folderId);
        ListFolderOutputDto listFolderOutputDto = new ListFolderOutputDto();
        listFolderOutputDto.setFolderOutputDtoList(folder.getFolderList().stream()
                .map(folderMapper::toFolderOutputDto)
                .collect(Collectors.toList()));
        return listFolderOutputDto;
    }

    @Override
    public void createFolder(Long parentId, FolderParamDto folderParamDto) {

    }

    @Override
    public void deleteFolder(Long folderId) {
        Folder folder = folderRepository.findFolder(folderId);
        folderRepository.delete(folder);

    }
}
