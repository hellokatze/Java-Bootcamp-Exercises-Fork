package model;

import java.util.ArrayList;
import java.util.List;

public class MovieStore {

  private List<Movie> movies;

  public MovieStore() {
    this.movies = new ArrayList<>();
  }

  public void addMovie(Movie movie) {
    this.movies.add(movie);
  }

  public List<Movie> filterByGenre(String genre) {
    return this.movies.stream()
      .filter(movie -> movie.getGenre().equals(genre))
      .toList();
  }

  public List<Movie> sortByReleaseYear() {
    return this.movies.stream()
      .sorted((x, y) -> Integer.compare(x.getYear(), y.getYear()))
      .toList();
  }

  public List<Movie> getTopRatedMovies(int n) {
    return this.movies.stream()
      .sorted((x, y) -> Integer.compare(y.getYear(), x.getYear()))
      .limit(n)
      .toList();
  }

}
