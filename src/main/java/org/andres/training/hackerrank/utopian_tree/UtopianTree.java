package org.andres.training.hackerrank.utopian_tree;

public class UtopianTree {

    /**
     * Utopian tree method
     * @param n the number of growth cycles to simulate
     * @return height of the tree
     */
    public int utopianTree(int n) {
        if (n < 0 || n > 60) {
            throw new IllegalArgumentException("n must be between 0 and 60");
        }
        int height = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                height += 1;
            } else {
                height = height * 2;
            }
        }

        return height;
    }
}
