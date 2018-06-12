package com.company;

import java.util.Scanner;

public class AvgHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество учеников");
        int n = sc.nextInt();
        int[] heights = new int[n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            heights[i] = x;
            sum += x;
        }
        double averageHeight = sum / n;
        System.out.println("Средний рост = " + averageHeight);
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (heights[i] > averageHeight) {
                count++;
            }
        }
        System.out.println("Число высоких учеников: " + count);
    }
}
