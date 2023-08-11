package model;

public class Movie {

  private String title;
  private String director;
  private String genre;
  private int year;
  private double rating;

  public Movie(String title, String director, String genre, int year, double rating) {
    this.title = title;
    this.director = director;
    this.genre = genre;
    this.year = year;
    this.rating = rating;
  }

  public String getTitle() {
    return this.title;
  }

  public String getDirector() {
    return this.director;
  }

  public String getGenre() {
    return this.genre;
  }

  public int getYear() {
    return this.year;
  }

  public double getRating() {
    return this.rating;
  }

  @Override
  public String toString() {
    return title + " (" + year + ") " + "directed by " + director + " - genre: " + genre + ", rating: " + rating;
  }

}
