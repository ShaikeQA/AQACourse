package ru.inno.lessons.homeWork2.task3;

public class Task3 {
    public static void main(String[] args) {

        Item glasses = new Item("glasses", "1001", "105", 995, "black");
        Item shirt = new Item("shirt", "4205", "150", 50, "green");
        Item hat = new Item("hat", "3645", "56", 23, "red");
        Item trousers = new Item("trousers", "8453", "40", 1, "blue");
        Item socks = new Item("socks", "2354", "5", 1999, "grey");

        glasses.printItemInfo();
        shirt.printItemInfo();
        hat.printItemInfo();
        trousers.printItemInfo();
        socks.printItemInfo();
    }
}
