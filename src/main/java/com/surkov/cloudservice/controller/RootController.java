package com.surkov.cloudservice.controller;

import com.surkov.cloudservice.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RootController {
    @RequestMapping(value = "/12", method = RequestMethod.GET)
    @ResponseBody
    public User strat() {
        return new User();
    }
}
