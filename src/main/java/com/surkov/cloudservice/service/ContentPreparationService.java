package com.surkov.cloudservice.service;


import com.surkov.cloudservice.dto.ContentOutputDtoList;

public interface ContentPreparationService {

    ContentOutputDtoList prepareContent(Long id);
}
