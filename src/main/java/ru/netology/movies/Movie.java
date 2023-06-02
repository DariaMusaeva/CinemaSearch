package ru.netology.movies;

public class Movie {

    private int id;
    private String movieName;
    private int releaseDate;
    private String genre;

    public Movie(int id, String movieName, int releaseDate, String genre) {
        this.id = id;
        this.movieName = movieName;
        this.releaseDate = releaseDate;
        this.genre = genre;
    }
}
