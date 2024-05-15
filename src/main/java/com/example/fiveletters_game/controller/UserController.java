package com.example.fiveletters_game.controller;

import com.example.fiveletters_game.entity.User;
import com.example.fiveletters_game.service.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
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


    @GetMapping("/registration")
        public String login(Model model){
        model.addAttribute("user", new User());
        System.out.println("ddd");
        return "registerPage";
    }

    @GetMapping("/index")
    public String play(){
        return "index";
    }

    @PostMapping("/save")
        public String save(@ModelAttribute("user") @Valid User user){
        userService.save(user);
        login();
        return "login";
    }

    @GetMapping("/getUsers")
    public void getUsers(){
        userService.getUsersList();
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/admin")
    public String adminPage(Model model){
        model.addAttribute("users", userService.getUsersList());
        return "adminPage";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
        return "redirect:/admin";
    }

}



