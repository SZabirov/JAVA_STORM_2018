package com.company;

public abstract class Pet {
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

    abstract void move();

    void voice(String word) {
        System.out.println("Ну окей, " + word);
    }
}
