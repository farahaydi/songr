package com.example.songr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldClass {
    @ResponseBody
    @GetMapping("/hello")
    public String HelloWorld()
    {
        return "Hello World !";
    }
}
