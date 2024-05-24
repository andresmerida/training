package org.andres.training.coderbyte;

public class FindIntersectionBest {
    public static void main(String[] args) {
        String[] array = new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};
        System.out.println(findIntersection(array));
    }

    public static String findIntersection(String[] strArr) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] arrayOne = strArr[0].split(", ");
        String[] arrayTwo = strArr[1].split(", ");

        for (String value : arrayOne) {
            for (String value2 : arrayTwo) {
                if (value.equals(value2)) {
                    stringBuilder.append(value).append(",");
                }
            }
        }

        return stringBuilder.isEmpty()
                ?
                "false" :
                stringBuilder.substring(0, stringBuilder.toString().length() - 1);
    }
}
