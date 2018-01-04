package com.surkov.cloudservice.controller;

import com.surkov.cloudservice.dto.ContentOutputDtoList;
import com.surkov.cloudservice.dto.FolderInputDto;
import com.surkov.cloudservice.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/folder")
public class MainFolderController {

    @Autowired
    ContentService contentService;

    @RequestMapping(value = "/{folderId}", method = RequestMethod.GET)
    @ResponseBody
    public ContentOutputDtoList getContent(@PathVariable("folderId") Long folderId) {

        return contentService.prepareContent(folderId);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void createFolder(@RequestBody FolderInputDto folderInputDto) {
        contentService.createFolder(folderInputDto);
    }

    @RequestMapping(value = "/{folderId}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteFolder(@PathVariable("folderId") Long folderId) {
        contentService.deleteFolder(folderId);
    }
}
