public class Store {

    private Movie[] movies; // an array that stores movie objects

    public Store() {
        // TODO
        this.movies = new Movie[10];
    }

    // getMovie() and setMovie() methods are for populating the Movie[10] array initialized upon creation of a new store.

    public Movie getMovie(int index) {
        // TODO
        Movie copy = this.movies[index];
        return new Movie(copy);
    }

    public void setMovie(int index, Movie movie) {
        // TODO
        Movie copy = new Movie(movie);
        this.movies[index] = copy;
    }


    public String toString() {
        String temp = "";
        for (Movie movie : movies) {
            temp += movie.toString() + "\n";
        }
        return temp;
    }

}
