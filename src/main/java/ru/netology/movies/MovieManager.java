package ru.netology.movies;

public class MovieManager {

    private Movie[] movies = new Movie[0];
    private int defaultMovies;

    public MovieManager() {
        this.defaultMovies = 5;
    }

    public MovieManager(int defaultMovies) {
        this.defaultMovies = defaultMovies;
    }

    public void add(Movie newMovie) {
        Movie[] tmp = new Movie[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = newMovie;
        movies = tmp;
    }

    public Movie[] findAll() {
        return movies;
    }

    public Movie[] findLast() {
        int resultLength;
        if (movies.length < defaultMovies) {
            resultLength = movies.length;
        } else {
            resultLength = defaultMovies;
        }
        Movie[] tmp = new Movie[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }
}
