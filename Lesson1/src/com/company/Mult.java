package com.company;


import java.util.Scanner;

public class Mult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во чисел:");
        int n = sc.nextInt();
        int i = 0;
        int p = 1;
        while (i < n) {
            int x = sc.nextInt();
            p = p * x;
            i = i + 1;
        }
        System.out.println(p);
    }
}
