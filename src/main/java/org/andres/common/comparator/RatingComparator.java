package org.andres.common.comparator;

import org.andres.common.comparable.Movie;

import java.util.Comparator;

public class RatingComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie m1, Movie m2) {
        return Double.compare(m1.rating(), m2.rating());
    }
}
