public class Movie {

    private String name;
    private String format;
    private double rating;

    public Movie(String name, String format, double rating) {
        setName(name);
        setFormat(format);
        setRating(rating);
    }

    public Movie(Movie source) {
        this.name = source.name;
        this.format = source.format;
        this.rating = source.rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // TODO
        if (name.isBlank() || name == null) {
          throw new IllegalArgumentException("Name can't be blank or null!");
        }
        this.name = name;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        // TODO
        if (format.isBlank() || format == null) {
          throw new IllegalArgumentException("Format can't be blank or null!");
        }
        this.format = format;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        // TODO
        if (rating < 0 && rating > 10) {
          throw new IllegalArgumentException("Please indicate a rating between 0 and 10.");
        }
        this.rating = rating;
    }

    public String toString() {
        return this.rating + "\t" + this.format + "\t\t" + this.name + "";
    }

}
