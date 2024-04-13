package com.example.fiveletters_game.controller;

import com.example.fiveletters_game.service.GameService;
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

    @GetMapping("/play")
        public String playPage(){
        return "playPage";
    }

    @GetMapping("/get")
        public void getWord(){
        GameService.getRandomWord();
    }
}
