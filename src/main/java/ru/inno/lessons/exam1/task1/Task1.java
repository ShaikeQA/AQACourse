package ru.inno.lessons.exam1.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину забора в СМ: ");
        double fence = scanner.nextDouble();

        System.out.print("Введите фразу, которую хотите написать на заборе: ");
        scanner.nextLine(); //нужно скушать перевод строки("\n") после nextDouble, иначе nextLine не считает строку.
        String phrase = scanner.nextLine();

        scanner.close();

        int countOfSpaceInPhrase = phrase.length() - phrase.replace(" ", "").length();
        // Вариант решения, если считаем, что в остатке даже одна буква будет занимать 3 символа
        try {
            if (fence >= (countOfSpaceInPhrase * 12 + Math.ceil(phrase.replace(" ", "").length() / 3.0) * 62)) {
                System.out.println("Надпись: " + phrase + "\nВлезает на забор длиной: " + fence + " см");
            } else {
                System.out.println("Надпись: " + phrase + "\nНе влезает на забор длиной: " + fence + " см");
            }
        } catch (Exception e) {
            System.out.println("Вам нечего написать на заборе");
        }

        // Вариант решения, если считаем, что 1 символ занимает 62/3 см
        double oneSymbolSize =  62.0 / 3.0;
        try {
            if (fence >= (countOfSpaceInPhrase * 12 + phrase.replace(" ", "").length() * oneSymbolSize)) {
                System.out.println("Надпись: " + phrase + "\nВлезает на забор длиной: " + fence + " см");
            } else {
                System.out.println("Надпись: " + phrase + "\nНе влезает на забор длиной: " + fence + " см");
            }
        } catch (Exception e) {
            System.out.println("Вам нечего написать на заборе");
        }

    }
}
