package com.surkov.cloudservice.service.impl;

import com.surkov.cloudservice.converter.FileMapper;
import com.surkov.cloudservice.dto.FileOutputDto;
import com.surkov.cloudservice.model.Folder;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FileHelper {

    @Autowired
    FileMapper fileMapper;

    public List<FileOutputDto> prepareFileDtoList(Folder folder) {
        return folder.getFiles()
                .stream()
                .map(fileMapper::toFileOutputDto)
                .collect(Collectors.toList());
    }

    public FileSystemResource createSystemResource(String path) {
        return new FileSystemResource(path);
    }

}
