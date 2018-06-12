package com.company;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double a = sc.nextInt();
        System.out.println("Введите знак:");
        String s = sc.next();
        char sign = s.charAt(0);
        System.out.println("Введите второе число:");
        double b = sc.nextInt();
        if (sign == '+') {
            System.out.println(a + b);
        }
        if (sign == '-') {
            System.out.println(a - b);
        }
        if (sign == '*') {
            System.out.println(a * b);
        }
        if (sign == '/') {
            System.out.println(a / b);
        }
    }
}
