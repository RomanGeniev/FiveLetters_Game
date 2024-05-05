package com.example.fiveletters_game.service;

import com.example.fiveletters_game.entity.User;
import com.example.fiveletters_game.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    UserRepository userRepository;


    public void save(User user){
        user.setRole("USER");
        userRepository.save(user);
    }

//    public boolean checkName(User user){
//        if( userRepository.findByName(user.getName())){
//
//        }

    }

