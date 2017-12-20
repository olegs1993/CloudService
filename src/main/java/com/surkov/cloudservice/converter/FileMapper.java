package com.surkov.cloudservice.converter;

import com.surkov.cloudservice.dto.FileOutputDto;
import com.surkov.cloudservice.model.File;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface FileMapper {

    @Mapping(source = "fileId",target = "fileId")
    @Mapping(source = "name",target = "name")
    FileOutputDto toFileOutputDto(File file);
}
