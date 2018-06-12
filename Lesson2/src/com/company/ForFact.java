package com.company;

import java.util.Scanner;

public class ForFact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
