package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/springbootdemo")
public class UserController {
    @RequestMapping(value = "/whoisgenius",method = RequestMethod.GET)
    String getUserByGet(@RequestParam(value = "userName") String userName){
        if (userName.equals("boyue")){
            return "He is Genius!!!";
        }else {
            return "NoNoNo,Boyue is Genius.";
        }
    }
}