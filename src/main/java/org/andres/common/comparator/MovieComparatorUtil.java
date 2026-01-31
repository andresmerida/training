package org.andres.common.comparator;

import org.andres.common.comparable.Movie;

import java.util.Comparator;

public final class MovieComparatorUtil {
    public static Comparator<Movie> byRatingThenYear = Comparator.comparingDouble(Movie::rating)
            .thenComparingInt(Movie::year);
    private MovieComparatorUtil() {}
}
