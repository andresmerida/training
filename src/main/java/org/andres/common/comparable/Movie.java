package org.andres.common.comparable;

public record Movie(String title, double rating, int year) implements Comparable<Movie> {

    @Override
    public int compareTo(Movie o) {
        return this.year - o.year;  // Sorts by year (Ascending)
    }
}
