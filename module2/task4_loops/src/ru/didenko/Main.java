package ru.didenko;

public class Main {

    public static void main(String[] args) {

        for (int i = 200; i <= 235; i++) {
            if (i <= 210) {
                System.out.println(i);
            } else if (i >= 220) {
                System.out.println(i);
            }
        }

        System.out.println("==========");

        int j = 200;
        while (j <= 235) {
            while (j <= 220) {
                j++;
                System.out.println(j);
            }
            System.out.println(j);
            j++;
        }

    }
}
