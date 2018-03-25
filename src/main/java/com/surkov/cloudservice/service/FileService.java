package com.surkov.cloudservice.service;


import org.springframework.core.io.FileSystemResource;

public interface FileService {
    FileSystemResource readFile(Long fileId);

}
