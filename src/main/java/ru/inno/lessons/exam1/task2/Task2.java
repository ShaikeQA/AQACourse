package ru.inno.lessons.exam1.task2;

import java.time.LocalDateTime;


public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        Cactus cactus = new Cactus("Cactus", 3);
        cactus.setLastWateringTime(LocalDateTime.of(2024, 1, 18, 17, 39, 0));
        cactus.getNextWateringDate(cactus.getLastWateringTime());

        cactus.watering();
        cactus.getNextWateringDate(cactus.getLastWateringTime());
    }
}
