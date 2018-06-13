package com.company;

public class ByValue {
    public static void main(String[] args) {
        int x = 0;
        m(x);
        System.out.println(x);
    }

    static void m(int x) {
        x = 42;
    }
}
