package com.company;

public class Fish extends Pet {
    @Override
    void move() {

    }

    @Override
    void voice(String word) {
        System.out.println("Ты что, забыл, что рыбы не разговаривают?");
    }
}
