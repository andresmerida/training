package org.andres.training.arrays.smaller_than_neighbours;

public class SmallerThanItsNeighbours {

    /**
     *
     * @param nums array
     * @return an integer smaller than its neighbours if not exist return zero
     */
    public int smallerThanNeighbours(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("null or empty array not allowed");
        }
        int smallerThanIstNeighbours = 0;

        for (int i = 1; i < nums.length -1; i++) {
            if (nums[i] > nums[i-1] && nums[i] > nums[i+1]) {
                smallerThanIstNeighbours = nums[i];
                break;
            }
        }

        return smallerThanIstNeighbours;
    }
}
