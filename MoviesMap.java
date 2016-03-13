package za.ac.mzilikazi;

/**
 * Created by Asavela on 2016-03-12.
 */
public class MoviesMap {
    private String movieName;
    private String Genre;

    public MoviesMap() {
    }

    public MoviesMap(String movieName, String genre) {
        this.movieName = movieName;
        Genre = genre;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    @Override
    public String toString() {
        return "MoviesMap{" +
                "movieName='" + movieName + '\'' +
                ", Genre='" + Genre + '\'' +
                '}';
    }
}
