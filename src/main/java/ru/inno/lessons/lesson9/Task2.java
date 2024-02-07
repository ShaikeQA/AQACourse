package ru.inno.lessons.lesson9;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        List<String> toDo = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            toDo.add("Task " + i);
        }
        for (String s : toDo) {
            System.out.println(s);
        }
    }


}
