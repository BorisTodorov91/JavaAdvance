package Exercice.IteratorsAndComparators.moviePlatforms;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        List<Movie> movies = new ArrayList<>();
        Movie movie1 = new Movie("Titanic", 12, 10);
        Movie movie2 = new Movie("American history X", 30, 9);
        Movie movie3 = new Movie("B Lord of the rings", 65, 8);

        MovieCompareByName byName = new MovieCompareByName();
        MovieCompareByBuget byBuget = new MovieCompareByBuget();

        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);

        movies.sort(byBuget);
        movies.sort(byName);
        System.out.println();
    }
}
