package com.company;

public class PetMaster {
    public static void main(String[] args) {
        Pet zhuchka = new Dog();
        Pet f = new Fish();
        Pet d = new Dog();
        Pet[] pets = {zhuchka, f, d};
        for (int i = 0; i < pets.length; i++) {
            pets[i].move();
        }
        zhuchka.age = 10;
        zhuchka.eat();
        zhuchka.voice("Gav-gav");
    }
}
