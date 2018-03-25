package com.surkov.cloudservice.service.impl;


import com.surkov.cloudservice.model.File;
import com.surkov.cloudservice.repository.FileRepository;
import com.surkov.cloudservice.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Service;

@Service
public class CommonFileService implements FileService {
    @Autowired
    private FileRepository fileRepository;
    @Autowired
    private FileHelper fileHelper;

    @Override
    public FileSystemResource readFile(Long fileId) {
        File file = fileRepository.findById(fileId);
        return fileHelper.createSystemResource(file.getDirPath());
    }
}
