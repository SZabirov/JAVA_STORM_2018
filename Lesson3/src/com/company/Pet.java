package com.company;

public class Pet {
    int age;
    String name;
    int height;
    int weight;

    void sleep() {
        System.out.println("Доброй ночи!");
    }

    void eat() {
        System.out.println("Я голоден, давай есть!");
    }

    void voice(String word) {
        System.out.println("Ну окей, " + word);
    }
}
