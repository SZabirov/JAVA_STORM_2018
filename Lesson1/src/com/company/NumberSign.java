package com.company;

import java.util.Scanner;

public class NumberSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x > 0) {
            System.out.println("Положительное");
        } else {
            if (x < 0) {
                System.out.println("Отрицательное");
            } else {
                System.out.println("Да это ж ноль");
            }
        }
    }
}
