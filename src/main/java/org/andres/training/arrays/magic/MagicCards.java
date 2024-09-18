package org.andres.training.arrays.magic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MagicCards {

    public List<Integer> getMagicCards(int[] carts1, int[] carts2) {
        if (carts1.length != carts2.length) {
            throw new IllegalArgumentException("Cards are not of same length");
        }

        Random random = new Random();
        boolean randomBoolean = random.nextBoolean();
        List<Integer> result = new ArrayList<>();
        int index = 0;
        if (randomBoolean) {
            for (int cart : carts1) {
                result.add(cart);
                result.add(carts2[index]);
                index++;
            }
        } else {
            for (int cart : carts2) {
                result.add(cart);
                result.add(carts1[index]);
                index++;
            }
        }
        return result;
    }
}
