package org.andres.training.coding_questions.random_numbers;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class RandomValue {
    public static void main(String[] args) {
        int min = 0, max = 4;
        System.out.println("Integer random: " + getRandomInteger(min, max));
        System.out.println("Boolean random: " + getRandomBoolean());
        System.out.println("Integer random: " + getIntegerThreadLocalRandom(min, max));

        // get random from a list of Elements
        List<Integer> list = Stream.of(1,2,3,4).toList();
        System.out.println("Integer list random: " + getIntegerRandomFromList(list));
    }

    private static int getRandomInteger(int min, int max) {
        Random random = new Random();
        return random.nextInt(min, max + 1);
    }

    private static boolean getRandomBoolean() {
        Random random = new Random();
        return random.nextBoolean();
    }

    private static int getIntegerThreadLocalRandom(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    private static Integer getIntegerRandomFromList(List<Integer> list) {
        Random random = new Random();
        return list.get(random.nextInt(list.size()));
    }
}
