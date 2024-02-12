package ru.inno.lessons.lesson10;

public class Task1 {
    public static void main(String[] args) {
        try {
            Copier.copyTextFile("src/main/java/ru/inno/lessons/lesson10/oldFiles/oldFile1.json", "src/main/java/ru/inno/lessons/lesson10/newFiles/newFiles1.json");
        } catch (Exception e) {
            System.out.println("Что-то пошло не так");
        }
    }
}
