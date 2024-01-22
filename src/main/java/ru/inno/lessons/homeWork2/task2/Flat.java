package ru.inno.lessons.homeWork2.task2;

import java.util.List;

public class Flat {

    int roomCount;
    int floor;
    int flatNumber;
    float square;
    Boolean isHaveBalcony;
    int balconyCount;
    List<Room> rooms;

    public Flat(int roomCount, int floor, int flatNumber, float square, Boolean isHaveBalcony, int balconyCount, List<Room> rooms) {
        this.roomCount = roomCount;
        this.floor = floor;
        this.flatNumber = flatNumber;
        this.square = square;
        this.isHaveBalcony = isHaveBalcony;
        this.balconyCount = balconyCount;
        this.rooms = rooms;
    }

    public void printFlatInfo() {
        System.out.println(
                        "roomCount:\t\t" + this.roomCount + "\n" +
                        "flor:\t\t\t" + this.floor + "\n" +
                        "flatNumber:\t\t" + this.flatNumber + "\n" +
                        "square:\t\t\t" + this.square + "\n" +
                        "isHaveBalcony:\t" + this.isHaveBalcony + "\n" +
                        "balconyCount:\t" + this.balconyCount + "\n" +
                        "Rooms:");

        for (Room room : this.rooms) {
            System.out.println("\t" + room.name + ":\t isHaveBalconyOut: " + room.isHaveBalconyOut + " \t square: " + room.square);
        }
    }
}
