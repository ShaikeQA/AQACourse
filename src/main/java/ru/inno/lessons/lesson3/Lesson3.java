package ru.inno.lessons.lesson3;

public class Lesson3 {
    public static void main(String[] args) {


        String books[] = new String[3];
        books[0] = "Первая книга";
        books[1] = "Вторая книга";
        books[2] = "Третья кника";

        for (String book : books) {
            System.out.println(book);
        }

        int x = 10;
        int y = x++   ;
        System.out.println(x + " " + y);
    }

}
