package org.andres.common.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableMain {
    static void main() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Inception", 8.8, 2010));
        movies.add(new Movie("Godfather", 9.2, 1972));
        movies.add(new Movie("Star Wars", 8.6, 1977));

        // USAGE: Comparable (Natural Sorting by year)
        Collections.sort(movies);
        movies.forEach(System.out::println);
    }
}
