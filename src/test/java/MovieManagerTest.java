import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.movies.Movie;
import ru.netology.movies.MovieManager;

public class MovieManagerTest {

    Movie movie1 = new Movie(1, "Matrix", 1999, "Action");
    Movie movie2 = new Movie(5, "Tenet", 2020, "Action");
    Movie movie3 = new Movie(9, "Titanic", 1997, "Drama");
    Movie movie4 = new Movie(14, "Interstellar", 2014, "Fantastic");
    Movie movie5 = new Movie(6, "1+1", 2011, "Drama");
    Movie movie6 = new Movie(19, "Shrek", 2001, "Cartoon");
    Movie movie7 = new Movie(15, "Home Alone", 1990, "Comedy");


    @Test
    public void shouldShowAllMovies() {
        MovieManager mng = new MovieManager();

        mng.add(movie1);
        mng.add(movie2);
        mng.add(movie3);
        mng.add(movie4);
        mng.add(movie5);
        mng.add(movie6);
        mng.add(movie7);

        Movie[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7};
        Movie[] actual = mng.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastMoviesWithDefaultSize() {
        MovieManager mng = new MovieManager();

        mng.add(movie1);
        mng.add(movie2);
        mng.add(movie3);
        mng.add(movie4);
        mng.add(movie5);

        Movie[] expected = {movie5, movie4, movie3, movie2, movie1};
        Movie[] actual = mng.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldShowLastMoviesIfDefaultSizeLessThanFilms() {
        MovieManager mng = new MovieManager();

        mng.add(movie1);
        mng.add(movie2);
        mng.add(movie3);
        mng.add(movie4);
        mng.add(movie5);
        mng.add(movie6);
        mng.add(movie7);

        Movie[] expected = {movie7, movie6, movie5, movie4, movie3};
        Movie[] actual = mng.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastMoviesIfDefaultSizeMoreThanFilms() {
        MovieManager mng = new MovieManager();

        mng.add(movie1);
        mng.add(movie2);
        mng.add(movie3);

        Movie[] expected = {movie3, movie2, movie1};
        Movie[] actual = mng.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastMoviesIfNewDefaultSizeLessThanFilms() {
        MovieManager mng = new MovieManager(6);

        mng.add(movie1);
        mng.add(movie2);
        mng.add(movie3);
        mng.add(movie4);
        mng.add(movie5);
        mng.add(movie6);
        mng.add(movie7);

        Movie[] expected = {movie7, movie6, movie5, movie4, movie3, movie2};
        Movie[] actual = mng.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastMoviesIfNewSizeMoreThanFilms() {
        MovieManager mng = new MovieManager(11);

        mng.add(movie1);
        mng.add(movie2);
        mng.add(movie3);
        mng.add(movie4);
        mng.add(movie5);
        mng.add(movie6);
        mng.add(movie7);

        Movie[] expected = {movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        Movie[] actual = mng.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddNewMovie() {
        MovieManager mng = new MovieManager();

        Movie movie8 = new Movie(31, "Hereditary", 2018, "Horror");

        mng.add(movie8);

        Movie[] expected = {movie8};
        Movie[] actual = mng.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddNewThreeMovies() {
        MovieManager mng = new MovieManager();

        Movie movie9 = new Movie(38, "The Gentlemen", 2019, "Criminal");
        Movie movie10 = new Movie(39, "Gladiator", 2000, "History");
        Movie movie11 = new Movie(40, "Leon", 1994, "Action");

        mng.add(movie9);
        mng.add(movie10);
        mng.add(movie11);

        Movie[] expected = {movie9, movie10, movie11};
        Movie[] actual = mng.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNotAddAnyMovies() {
        MovieManager mng = new MovieManager();

        Movie[] expected = {};
        Movie[] actual = mng.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
}
