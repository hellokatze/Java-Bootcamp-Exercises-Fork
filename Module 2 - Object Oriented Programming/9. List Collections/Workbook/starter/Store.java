import java.util.List;
import java.util.ArrayList;

public class Store {

    private List<Movie> movies;

    public Store() {
        // TODO
        this.movies = new ArrayList<>();
    }

    public Movie getMovie(int index) {
        // TODO
        return new Movie(movies.get(index));
    }

    public void setMovie(int index, Movie movie) {
        // TODO
        Movie copy = new Movie(movie);
        this.movies.set(index, copy);
    }

    public void addMovie(Movie movie) {
        // TODO
        Movie copy = new Movie(movie);
        this.movies.add(copy);
    }

    public String toString() {
        String temp = "";
        for (Movie movie : movies) {
            temp += movie.toString() + "\n";
        }
        return temp;
    }

}
