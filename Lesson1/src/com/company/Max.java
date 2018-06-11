package com.company;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько будет чисел?");
        int n = sc.nextInt();
        int i = 0;
        int max = 0;
        while (i < n) {
            int x = sc.nextInt();
            if (x > max) {
                max = x;
            }
            i++;
        }
    }
}
