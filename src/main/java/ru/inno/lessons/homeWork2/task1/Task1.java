package ru.inno.lessons.homeWork2.task1;

public class Task1 {
    public static void main(String[] args) {
        String cardNumber1 = "1234 5678 9012 3456";
        String cardNumber2 = "1234567890123456";

        System.out.println("**** **** **** " + cardNumber2.substring(cardNumber2.length() - 4));
        System.out.println("**** **** **** " + cardNumber1.substring(cardNumber1.length() - 4));
    }
}
