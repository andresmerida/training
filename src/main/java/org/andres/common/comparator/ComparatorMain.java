package org.andres.common.comparator;

import org.andres.common.comparable.Movie;

import java.util.ArrayList;
import java.util.List;

public class ComparatorMain {
    static void main() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Inception", 8.8, 2010));
        movies.add(new Movie("Godfather", 9.2, 1972));
        movies.add(new Movie("Martial", 8.6, 1990));
        movies.add(new Movie("Star Wars", 8.6, 1977));

        // USAGE 2: Comparator (Custom sort by Rating)
        movies.sort(new RatingComparator());
        movies.forEach(System.out::println);

        IO.println();

        // Now sorting by rating and year
        movies.sort(MovieComparatorUtil.byRatingThenYear);
        movies.forEach(System.out::println);
    }
}
