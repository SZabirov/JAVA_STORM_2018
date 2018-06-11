package com.company;


import java.util.Scanner;

public class Main {
    //psvm
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s;
        System.out.println("Введите растояние (в км):");
        s = sc.nextInt();
        int cost = s * 15;
        if (cost > 250) {
            cost = cost - 25;
            System.out.println("Применена скидка 25 р.");
            System.out.println("Стоимость: " + cost);
        } else {
            System.out.println("Скидка не полагается.");
            System.out.println(cost);
        }
    }
}
