package com.surkov.cloudservice.dto;

import java.util.List;

public class ContentOutputDtoList {

    private List<FolderOutputDto> folderOutputDtoList;
    private List<FileOutputDto> fileOutputDtoList;

    public List<FileOutputDto> getFileOutputDtoList() {
        return fileOutputDtoList;
    }

    public void setFileOutputDtoList(List<FileOutputDto> fileOutputDtoList) {
        this.fileOutputDtoList = fileOutputDtoList;
    }

    public List<FolderOutputDto> getFolderOutputDtoList() {
        return folderOutputDtoList;
    }

    public void setFolderOutputDtoList(List<FolderOutputDto> folderOutputDtoList) {
        this.folderOutputDtoList = folderOutputDtoList;
    }
}
