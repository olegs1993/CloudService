package com.surkov.cloudservice.controller;

import com.surkov.cloudservice.dto.FolderOutputDto;
import com.surkov.cloudservice.dto.ListFolderOutputDto;
import com.surkov.cloudservice.model.Folder;
import com.surkov.cloudservice.service.FolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainScreenController {
    @Autowired
    private FolderService folderService;

    @RequestMapping(value = "/folder/{folderId}")
    @ResponseBody
    public ListFolderOutputDto getFolder(@PathVariable("folderId") Long folderId) {

        return folderService.getFolder(folderId);
    }
}
