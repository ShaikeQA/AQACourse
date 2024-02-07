package ru.inno.lessons.lesson8;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {

        Set<String> str = new HashSet<>();
        str.add("first");
        str.add("second");
        System.out.println(str.size());
        Object[] arrayStr = str.toArray();
        System.out.println(arrayStr[1]);

    }
}
