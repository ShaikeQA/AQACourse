package ru.inno.lessons.lesson9;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        List<Movie> films = new ArrayList<>();

        films.add(new Movie("Movie1", 0, "Action", "Russia", false));
        films.add(new Movie("Movie2", 5, "notAction", "USA", false));
        films.add(new Movie("Movie3", 10, "не совсем Action", "UK", true));

        System.out.println(films.get(1));
    }
}