package com.example.songr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@Controller
public class capitalizeClass {
    @GetMapping("/capitalize/{upper}")
    public String capitalizer(Model model, @PathVariable String upper) {
        String capitalized = upper.toUpperCase();
        model.addAttribute("capitalizedText", capitalized);
        return "capitalizeClass";
    }

}
