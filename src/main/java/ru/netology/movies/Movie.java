package ru.netology.movies;

public class Movie {

    private final int id;
    private final String movieName;
    private final int releaseDate;
    private final String genre;

    public Movie(int id, String movieName, int releaseDate, String genre) {
        this.id = id;
        this.movieName = movieName;
        this.releaseDate = releaseDate;
        this.genre = genre;
    }
}
