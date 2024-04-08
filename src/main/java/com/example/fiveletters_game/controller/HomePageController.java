package com.example.fiveletters_game.controller;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomePageController {

    @GetMapping("/")
    public String homePage(Model model){
        model.addAttribute("title", "Главная страница");
        return "homePage";
    }

    @GetMapping("/login")
    public String loginPage(Model model){
        model.addAttribute("title", "Главная страница");
        return "login";
    }
    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("title", "Главная страница");
        return "hello";
    }
}
