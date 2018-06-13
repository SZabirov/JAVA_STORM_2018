package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {9, 6, 4, 7};
        int[] arr1 = {42, 1, 0, 9, 6, 5, 4, 7};
        sortArray(arr);
        sortArray(arr1);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }

    static void sortArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int indexOfMax = 0;
            for (int j = 0; j < n - i; j++) {
                if (arr[j] > arr[indexOfMax]) {
                    indexOfMax = j;
                }
            }
            int buf = arr[indexOfMax];
            arr[indexOfMax] = arr[n - 1 - i];
            arr[n - 1 - i] = buf;
        }
    }
}
