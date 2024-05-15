package com.example.fiveletters_game.service;

import com.example.fiveletters_game.entity.User;
import com.example.fiveletters_game.repository.UserRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

@Service
@RequiredArgsConstructor
public class UserService {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    UserRepository userRepository;

    @Autowired
    private final PasswordEncoder passwordEncoder;


    public void save(@NonNull User user){
        user.setRole("USER");
        user.setHighScore(0);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }

    public List<User> getUsersList(){
        List<User> users = userRepository.findAll();
        return users;
    }

    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }

//    public boolean checkName(User user){
//        if( userRepository.findByName(user.getName())){
//
//        }

    }

