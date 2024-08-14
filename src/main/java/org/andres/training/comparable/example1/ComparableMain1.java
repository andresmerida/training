package org.andres.training.comparable.example1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableMain1 {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Force Awakens", 8.3, 2015));
        movies.add(new Movie("Star Wars", 8.7, 1977));
        movies.add(new Movie("Empire Strikes Back", 8.8, 1980));
        movies.add(new Movie("Return of the Jedi", 8.4, 1983));

        System.out.println("Movies not ordered: ");
        for (Movie movie : movies) {
            System.out.println(movie.toString());
        }

        System.out.println();
        Collections.sort(movies);
        System.out.println("Movies sorting by year: ");
        for (Movie movie : movies) {
            System.out.println(movie.toString());
        }

        System.out.println();
        System.out.println("Sorted by rating: ");
        movies.sort(Comparator.comparing(Movie::rating, Comparator.reverseOrder()));
        movies.forEach(System.out::println);

        System.out.println();
        System.out.println("Sorted by title: ");
        movies.sort(Comparator.comparing(Movie::title));
        movies.forEach(System.out::println);
    }
}
