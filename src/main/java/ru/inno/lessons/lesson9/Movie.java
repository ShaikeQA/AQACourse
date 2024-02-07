package ru.inno.lessons.lesson9;

import java.util.Objects;

public class Movie {

    private String name;
    private int rate;
    private String genre;
    private String Country;
    private boolean isHaveOskar;

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", genre='" + genre + '\'' +
                ", Country='" + Country + '\'' +
                ", isHaveOskar=" + isHaveOskar +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return rate == movie.rate && isHaveOskar == movie.isHaveOskar && Objects.equals(name, movie.name) && Objects.equals(genre, movie.genre) && Objects.equals(Country, movie.Country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rate, genre, Country, isHaveOskar);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public boolean isHaveOskar() {
        return isHaveOskar;
    }

    public void setHaveOskar(boolean haveOskar) {
        isHaveOskar = haveOskar;
    }

    public Movie(String name, int rate, String genre, String country, boolean isHaveOskar) {
        this.name = name;
        this.rate = rate;
        this.genre = genre;
        Country = country;
        this.isHaveOskar = isHaveOskar;
    }
}
