package model;

public class Movie {

  private String title;
  private String director;
  private String genre;
  private int year;
  private double rating;

  public Movie(String title, String director, String genre, int year, double rating) {

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

}
