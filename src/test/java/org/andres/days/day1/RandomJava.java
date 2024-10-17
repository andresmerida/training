package org.andres.days.day1;

import java.util.Random;

public class RandomJava {

    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Random number from 0 to 10 ");
        for (int i = 0; i < 20; i++) {
            System.out.println(random.nextInt(0, 11));
        }

        System.out.println();
        System.out.println("Random number false or true");
        for (int i = 0; i < 20; i++) {
            System.out.println(random.nextBoolean());
        }

        System.out.println();
        System.out.println("Random number between 1 and 10 ");
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(1, 11));
        }

        System.out.println();
        System.out.println("Random with Math.random()");
        int min = 0;
        int max = 10;
        for (int i = 0; i < 100; i++) {
            int randomNum = (int) (Math.random() * (max - min + 1) + min);
            System.out.println(randomNum);
        }
    }
}
