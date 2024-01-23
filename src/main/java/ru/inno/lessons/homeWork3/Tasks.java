package ru.inno.lessons.homeWork3;

public class Tasks {
    public static void main(String[] args) {
        //Task1
        String[] toDoList = new String[]{"Have a shower", "Have breakfast", "Work", "Relax", "Go to sleep"};
        for (String e : toDoList) {
            System.out.println(e);
        }

        //Task2
        double[] doubleNumbers = new double[]{Math.PI, Math.E, 1};
        for (double e : doubleNumbers) {
            System.out.println(e);
        }

        //Task3
        Movie[] films = {
                new Movie("FirstFilm", 5.6F, "Action", "Russia", false),
                new Movie("SecondFilm", 8.9F, "Action", "USA", true),
                new Movie("ThirdFilm", 6.7F, "Comedy", "Japan", false)
        };

        //Task4
        for (int i = 1; i < 1_000_000_000; i++) {
            System.out.println(i);
        }

        //Task5
        for (Movie e : films) {
            System.out.println("name: " + e.name + "\nrate: " + e.rate + "\ngenre: " + e.genre + "\ncountry: " + e.country + "\nisHaveOscar: " + e.isHaveOscar);
        }

        //Task6
        String[] gamersName = {"Gamer1", "Gamer2", "Gamer3", "Gamer4", "Gamer5", "Gamer6", "Gamer7", "Gamer8", "Gamer9", "Gamer10"};
        for (int i = 0; i < 3; i++) {
            System.out.println(gamersName[i]);
        }
    }
}
