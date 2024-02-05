package ru.inno.lessons.lesson7;

public class Task3 {
    public static void main(String[] args) {
        int buff = 16;

        if (buff % 2 == 0) {
            if (buff % 4 == 0) {
                System.out.println("Четное число. Кратно четырем");
            } else {
                System.out.println("Четное число");
            }
        } else {
            if (buff % 3 == 0) {
                System.out.println("Нечетное число. Кратно трем.");
            } else {
                System.out.println("Нечетное число");
            }
        }
    }
}
