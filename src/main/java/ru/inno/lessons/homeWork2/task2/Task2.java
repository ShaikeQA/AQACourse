package ru.inno.lessons.homeWork2.task2;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {

        Room livingRoom = new Room("LivingRoom", 22.5F, true);
        Room diningRoom = new Room("DiningRoom", 14.9F, true);
        Room bedRoom = new Room("BedRoom", 18.1F, false);

        var rooms = new ArrayList<Room>();

        rooms.add(livingRoom);
        rooms.add(bedRoom);
        rooms.add(diningRoom);

        Flat myFlat = new Flat(3, 2, 19, 55.5F, true, 3, rooms);

        myFlat.printFlatInfo();
    }
}
