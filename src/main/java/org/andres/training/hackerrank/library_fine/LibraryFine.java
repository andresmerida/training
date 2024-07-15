package org.andres.training.hackerrank.library_fine;

public class LibraryFine {
    public static void main(String[] args) {
        System.out.println("floor method rounds a number DOWN to the nearest integer.");
        System.out.println(Math.floor(0.60));
        System.out.println(Math.floor(0.40));
        System.out.println(Math.floor(5));
        System.out.println(Math.floor(5.1));
        System.out.println(Math.floor(-5.1));
        System.out.println(Math.floor(-5.9));

        System.out.println("To roud a number UP to the nearest integer, look at the ceil. method.");

        System.out.println(Math.ceil(0.60));
        System.out.println(Math.ceil(0.40));
        System.out.println(Math.ceil(5));
        System.out.println(Math.ceil(5.1));
        System.out.println(Math.ceil(-5.1));
        System.out.println(Math.ceil(-5.9));

        System.out.println("The round() method rounds a number to the nearest integer.");

        System.out.println(Math.round(0.60));
        System.out.println(Math.round(0.40));
        System.out.println(Math.round(5));
        System.out.println(Math.round(5.1));
        System.out.println(Math.round(-5.1));
        System.out.println(Math.round(-5.9));
    }

    public int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        if (y1 > y2) return 10000;
        if (y1 == y2 && m1 > m2) return 500 * (m1 - m2);
        if (y1 == y2 && m1 == m2 && d1 > d2) return 15 * (d1 - d2);
        return 0;
    }
}
