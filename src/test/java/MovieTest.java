import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.movies.Movie;
import ru.netology.movies.MovieManager;

public class MovieTest {

    Movie movie1 = new Movie(1, "Matrix", 1999, "Action");
    Movie movie2 = new Movie(5, "Tenet", 2020, "Action");
    Movie movie3 = new Movie(9, "Titanic", 1997, "Drama");
    Movie movie4 = new Movie(14, "Interstellar", 2014, "Fantastic");
    Movie movie5 = new Movie(6, "1+1", 2011, "Drama");
    Movie movie6 = new Movie(19, "Shrek", 2001, "Cartoon");
    Movie movie7 = new Movie(15, "Home Alone", 1990, "Comedy");

    MovieManager mng = new MovieManager();

    @BeforeEach
    public void setup() {
        mng.add(movie1);
        mng.add(movie2);
        mng.add(movie3);
        mng.add(movie4);
        mng.add(movie5);
        mng.add(movie6);
        mng.add(movie7);
    }

    @Test
    public void shouldShowAllMovies() {

        Assertions.assertArrayEquals(new Movie[]{movie1, movie2, movie3, movie4, movie5, movie6, movie7}, mng.findAll());
    }

    @Test
    public void shouldShowDefaultLastMovies() {

        Assertions.assertArrayEquals(new Movie[]{movie7, movie6, movie5, movie4, movie3}, mng.findLast());
    }

    @Test
    public void shouldShowLast7Movies() {
        mng.defaultMoviesChanger(7);

        Assertions.assertArrayEquals(new Movie[]{movie7, movie6, movie5, movie4, movie3, movie2, movie1}, mng.findLast());
    }

    @Test
    public void shouldShowLast3Movies() {
        mng.defaultMoviesChanger(3);

        Assertions.assertArrayEquals(new Movie[]{movie7, movie6, movie5}, mng.findLast());
    }

    @Test
    public void shouldAddNewMovie() {
        Movie movie8 = new Movie(31, "Hereditary", 2018, "Horror");

        mng.add(movie8);

        Assertions.assertArrayEquals(new Movie[]{movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8}, mng.findAll());
    }
}
