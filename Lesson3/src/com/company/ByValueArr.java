package com.company;

public class ByValueArr {
    public static void main(String[] args) {
        int[] arr = {0, 1, 5};
        m(arr);
        System.out.println(arr);
    }

    static void m(int[] arr) {
        arr[0] = 42;
    }
}
