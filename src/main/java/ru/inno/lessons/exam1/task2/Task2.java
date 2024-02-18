package ru.inno.lessons.exam1.task2;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        Cactus cactus = new Cactus("Cactus", 3);
        cactus.setLastWateringTime(LocalDateTime.of(2024, 1, 18, 17, 0, 0));
        cactus.getNextWateringDate(cactus.getLastWateringTime());
    }
}
