package ru.inno.lessons.lesson9;

import java.util.List;
import java.util.Objects;

public class Company {

    private String name;
    private String createdDate;
    private List<Movie> films;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public List<Movie> getFilms() {
        return films;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", films=" + films +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(name, company.name) && Objects.equals(createdDate, company.createdDate) && Objects.equals(films, company.films);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, createdDate, films);
    }

    public Company(String name, String createdDate, List<Movie> films) {
        this.name = name;
        this.createdDate = createdDate;
        this.films = films;
    }
}
