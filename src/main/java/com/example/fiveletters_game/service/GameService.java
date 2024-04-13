package com.example.fiveletters_game.service;

import com.example.fiveletters_game.data.Words;

import java.util.Random;

public class GameService extends Words {
    public static String getRandomWord(){
        Random random = new Random();
        String word = words[random.nextInt(0, words.length - 1)];
        System.out.println(word);
        return word;
    }
    public static void main(String[] args) {


        System.out.println();
    }


}
