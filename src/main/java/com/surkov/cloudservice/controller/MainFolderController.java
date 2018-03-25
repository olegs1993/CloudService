package com.surkov.cloudservice.controller;

import com.surkov.cloudservice.dto.ContentOutputDtoList;
import com.surkov.cloudservice.dto.FolderInputDto;
import com.surkov.cloudservice.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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

    @RequestMapping(value = "/download/{fileId}", method = RequestMethod.POST, produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    @ResponseBody
    public ResponseEntity<FileSystemResource> downloadFile(@PathVariable("fileId") Long fileId) {
        return ResponseEntity
                .ok()
                .header("Content-Disposition", "attachment")
                .body(contentService.downloadFile(fileId));
    }
}
