package org.andres.training.comparable.example1;

public record Movie(String title, Double rating, Integer year) implements Comparable<Movie> {

    @Override
    public int compareTo(Movie m) {
        return this.year - m.year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                ", year=" + year +
                '}';
    }
}
