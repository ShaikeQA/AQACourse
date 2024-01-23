package ru.inno.lessons.homeWork3;

public class Movie {

    String name;
    float rate;
    String genre;
    String country;
    Boolean isHaveOscar;

    public Movie(String name, float rate, String genre, String country, Boolean isHaveOscar) {
        this.name = name;
        this.rate = rate;
        this.genre = genre;
        this.country = country;
        this.isHaveOscar = isHaveOscar;
    }
}
