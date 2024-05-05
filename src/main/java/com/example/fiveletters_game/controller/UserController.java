package com.example.fiveletters_game.controller;

import com.example.fiveletters_game.entity.User;
import com.example.fiveletters_game.service.UserService;
import jakarta.validation.Valid;
import javassist.bytecode.ClassFile;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
public class UserController {

    UserService userService;

    @GetMapping("/")
    public String homePage(Model model){
        model.addAttribute("title", "Главная страница");
        return "homePage";
    }


    @GetMapping("/login")
        public String login(Model model){
        model.addAttribute("user", new User());
        System.out.println("ddd");
        return "login";
    }

    @GetMapping("/index")
    public String play(){
        return "index";
    }

    @PostMapping("/save")
        public String save(@ModelAttribute("user") @Valid User user){
        System.out.println("wweew");
        userService.save(user);
        return "redirect:login";

    }

}



