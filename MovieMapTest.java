package za.ac.mzilikazi;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

/**
 * Created by Asavela on 2016-03-12.
 */
public class MovieMapTest {
    MoviesMap songsFavourite;
    MoviesMap asasFavourite;
    MoviesMap lindosFavourite;
    MoviesMap milisFavourite;

    @Before
    public void setUp() throws Exception {
        songsFavourite = new MoviesMap("Harry Potter", "Horror");
        asasFavourite = new MoviesMap("What happens in Vegas", "Comedy");
        lindosFavourite = new MoviesMap("Divergent", "Thriller");
        milisFavourite = new MoviesMap("I killed my best friend", "Sci-fi");
    }

        @After
        public void tearDown() throws Exception {

        }

        @Test
        public void testHashMap() throws Exception {

            HashMap<String, String> movieList = new HashMap<String, String>();

            movieList.put(songsFavourite.getMovieName(), songsFavourite.getGenre());
            movieList.put(asasFavourite.getMovieName(), asasFavourite.getGenre());
            movieList.put(lindosFavourite.getMovieName(), lindosFavourite.getGenre());
            movieList.put(milisFavourite.getMovieName(), milisFavourite.getGenre());

            System.out.print("Here are the Movies " + movieList + "\n");
            System.out.print("The size of the Movies is: " + movieList.size() + "\n");

            movieList.remove("Harry Potter");
            System.out.print("Here are the Movies " + movieList + "\n");
            System.out.print("The size of the Movies is: " + movieList.size() + "\n");

            movieList.clear();
            System.out.print("Here are the Movies " + movieList + "\n");
            System.out.print("The size of the Movies is: " + movieList.size() + "\n");

            Assert.assertEquals("Horror", songsFavourite.getGenre());
        }


}
