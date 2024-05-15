package com.example.fiveletters_game.config;

import com.example.fiveletters_game.entity.User;
import com.example.fiveletters_game.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByName(username);
        System.out.println(userRepository.findByName(username));
        return user.map(MyUserDetails::new)
                .orElseThrow(()->new UsernameNotFoundException(username + "No users"));
    }
}
