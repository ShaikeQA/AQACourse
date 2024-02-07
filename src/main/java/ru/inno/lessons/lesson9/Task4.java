package ru.inno.lessons.lesson9;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        List<Company> companyList = new ArrayList<>();
        companyList.add(new Company("Company1", "2021-09-23", new ArrayList<>()));
        companyList.add(new Company("Company2", "2022-10-24", new ArrayList<>()));
        companyList.add(new Company("Company3", "2023-11-25", new ArrayList<>()));

        companyList.get(0).getFilms().add(new Movie("Movie1", 0, "Action", "Russia", false));
        companyList.get(0).getFilms().add(new Movie("Movie2", 5, "notAction", "USA", false));
        companyList.get(0).getFilms().add(new Movie("Movie3", 10, "не совсем Action", "UK", true));

        companyList.get(1).getFilms().add(new Movie("Movie4", 0, "Action", "Russia", false));
        companyList.get(1).getFilms().add(new Movie("Movie5", 5, "notAction", "USA", false));
        companyList.get(1).getFilms().add(new Movie("Movie6", 10, "не совсем Action", "UK", true));

        companyList.get(2).getFilms().add(new Movie("Movie7", 0, "Action", "Russia", false));
        companyList.get(2).getFilms().add(new Movie("Movie8", 5, "notAction", "USA", false));
        companyList.get(2).getFilms().add(new Movie("Movie9", 10, "не совсем Action", "UK", true));

        for (Company company : companyList) {
            System.out.print(company.getName() + ": ");
            for (Movie film : company.getFilms()) {
                System.out.print(film.getName() + " ");
            }
            System.out.println();
        }
    }
}
