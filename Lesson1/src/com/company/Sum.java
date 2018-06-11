package com.company;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во чисел:");
        int n = sc.nextInt();
        int i = 0;
        int sum = 0;
        while (i < n) {
            int x = sc.nextInt();
            sum = sum + x;
            i = i + 1;
        }
        System.out.println(sum);
    }
}
