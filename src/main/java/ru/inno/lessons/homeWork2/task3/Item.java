package ru.inno.lessons.homeWork2.task3;

public class Item {
    String name;
    String itemCode;
    String price;
    int count;
    String color;

    public Item(String name, String itemCode, String price, int count, String color) {
        this.name = name;
        this.itemCode = itemCode;
        this.price = price;
        this.count = count;
        this.color = color;
    }

    public  void printItemInfo(){
        System.out.println(
                "Item code:\t" + this.itemCode + "\n" +
                "Name:\t\t" + this.name + "\n" +
                "Price:\t\t" + this.price + "\n" +
                "Count:\t\t" + this.count + "\n" +
                "Color:\t\t" + this.color + "\n"
        );
    }
}
