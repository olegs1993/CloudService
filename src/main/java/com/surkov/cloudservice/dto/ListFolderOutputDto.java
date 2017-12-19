package com.surkov.cloudservice.dto;

import java.util.List;

public class ListFolderOutputDto {
    private List<FolderOutputDto> folderOutputDtoList;

    public List<FolderOutputDto> getFolderOutputDtoList() {
        return folderOutputDtoList;
    }

    public void setFolderOutputDtoList(List<FolderOutputDto> folderOutputDtoList) {
        this.folderOutputDtoList = folderOutputDtoList;
    }
}
