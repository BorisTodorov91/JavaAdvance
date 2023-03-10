package Exercice.IteratorsAndComparators.moviePlatforms;

import java.util.Comparator;

public class MovieCompareByName implements Comparator<Movie> {
    @Override
    public int compare(Movie first, Movie second) {
        return first.getName().compareTo(second.getName());
    }
}
