package org.andres.training.common.clasic;

public class MainClassic {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println(findValue(array, 10));
    }

    /**
     * Binary algorithm, it applicable to find an element to array ordered
     * @return index of the value
     */
    static int findValue(int[] array, int value) {
        int leftIndex = 0;
        int rightIndex = array.length -1;
        int middleIndex = -1;

        while (leftIndex <= rightIndex) {
            middleIndex = (leftIndex + rightIndex) / 2;
            if (array[middleIndex] == value) {
                return middleIndex;
            }

            if (array[middleIndex] < value) {
                leftIndex = middleIndex + 1;
            } else {
                rightIndex = middleIndex -1;
            }
        }

        return -1;
    }
}
