package com.surkov.cloudservice.controller;

import com.surkov.cloudservice.dto.ContentOutputDtoList;
import com.surkov.cloudservice.service.ContentPreparationService;
import com.surkov.cloudservice.service.FolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainScreenController {
    @Autowired
    ContentPreparationService contentPreparationService;

    @RequestMapping(value = "/folder/{folderId}")
    @ResponseBody
    public ContentOutputDtoList getFolder(@PathVariable("folderId") Long folderId) {

        return contentPreparationService.prepareContent(folderId);
    }
}
