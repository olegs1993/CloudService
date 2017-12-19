package com.surkov.cloudservice.converter;

import com.surkov.cloudservice.dto.FolderOutputDto;
import com.surkov.cloudservice.model.Folder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface FolderMapper {

    @Mapping(source = "folderId", target = "folderId")
    @Mapping(source = "name", target = "name")
    FolderOutputDto toFolderOutputDto(Folder folder);
}
