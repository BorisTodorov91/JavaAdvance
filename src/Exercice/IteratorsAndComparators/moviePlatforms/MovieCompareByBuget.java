package Exercice.IteratorsAndComparators.moviePlatforms;

import java.util.Comparator;

public class MovieCompareByBuget implements Comparator<Movie> {

    @Override
    public int compare(Movie first, Movie second) {

        return second.getBudget() - first.getBudget();
    }
}
