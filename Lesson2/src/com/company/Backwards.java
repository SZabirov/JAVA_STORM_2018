package com.company;

import java.util.Scanner;

public class Backwards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество чисел:");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
