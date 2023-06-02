package ru.netology.movies;

public class MovieManager {

    private Movie[] movies = new Movie[0];
    private int defaultMovies = 5;

    public void defaultMoviesChanger(int newDefaultMovies){
        defaultMovies = newDefaultMovies;
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
        Movie[] all = findAll();
        Movie[] tmp = new Movie[all.length];
        Movie[] result = new Movie[defaultMovies];
        for (int i = 0; i < all.length; i++) {
           tmp[i] = all[all.length -1 -i];
        }
        for (int i = 0; i < defaultMovies; i++) {
            result[i] = tmp[i];
        }
        return result;
    }
}
