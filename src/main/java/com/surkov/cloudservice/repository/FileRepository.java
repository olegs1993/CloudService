package com.surkov.cloudservice.repository;

import com.surkov.cloudservice.model.File;

public interface FileRepository {
    File findById(Long fileId);
}
