package ru.inno.lessons.lesson7;

public class Task5 {
    public static void main(String[] args) {
        String password = "sfghs2fj[dh!";

        if (password.length() < 8) {
            System.out.println("Пароль не менее 8 символов");
        } else if (!password.matches(".*\\d.*")) {
            System.out.println("пароль должен содержать минимум 1 цифру");
        } else if (!(password.contains("!") || password.contains("@") || password.contains("#"))) {  // вижу решение путем перечесления этих символов, regexp написать не смог
            System.out.println("Пароль должен содержать минимум 1 спецсимвол");
        } else System.out.println("Пароль принят");
    }
}
