package ru.didenko;

public class Main {

    public static void main(String[] args) {

//          from 200_000 to 220_000
//          from 220_000 to 235_000
//          with while and fori
        for (int i = 200_000; i < 235_000; i++) {
            if (i < 220_000) {
                System.out.println(i + " - Это i - внутренний цикл");

            }
            else System.out.println(i+ " - Это i - внешний цикл");
        }

        int j = 200_000;
        while(j < 235_000){
            while (j < 220_000){
            j++;
                System.out.println(j+ " - Это j - внутренний цикл");
            }
            System.out.println(j + " - Это j - внешний цикл");
            j++;
        }

    }
}
