package ru.inno.lessons.exam1.task2;

import lombok.*;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.time.LocalDateTime.now;

public class Cactus extends Plants {

    public Cactus(String name, int age) {
        super(name, age, null);
    }

    @Override
    public LocalDateTime getNextWateringDate(LocalDateTime lastWatering) {
        int airHumidity = Sensor.getAirHumidity();
        System.out.println("Влажнасть = " + airHumidity);
        double countOfDaysAfterWatering = Duration.between(lastWatering, now()).toDays();
        switch (seasonOfYear(lastWatering)) {
            case "winter":
                if (countOfDaysAfterWatering > 30) {
                    System.out.println("Полейте сейчас");
                    return now();
                } else {
                    System.out.println("Полейте: " + lastWatering.plusMonths(1));
                    return lastWatering.plusMonths(1);
                }
            case "spring", "autumn":
                if (countOfDaysAfterWatering > 14) {
                    System.out.println("Полейте сейчас");
                    return now();
                } else {
                    System.out.println("Полейте: " + lastWatering.plusDays(14));
                    return lastWatering.plusDays(14);
                }
            case "summer":
                if (airHumidity < 30 && countOfDaysAfterWatering >= 2) {
                    System.out.println("Полейте сейчас");
                    return now();
                } else {
                    System.out.println("Не поливайте кактус, проверьте дату полива завтра");
                    return null;
                }
            default:
                System.out.println("Сбой программы");
                return null;
        }
    }

    @Override
    public LocalDateTime watering() {
        lastWateringTime = LocalDateTime.now();
        return lastWateringTime;
    }

    private String seasonOfYear(LocalDateTime timeStump) throws RuntimeException {
        List<Month> winter = new ArrayList<>(Arrays.asList(
                Month.DECEMBER,
                Month.JANUARY,
                Month.FEBRUARY
        ));
        List<Month> spring = new ArrayList<>(Arrays.asList(
                Month.MARCH,
                Month.APRIL,
                Month.MAY
        ));
        List<Month> summer = new ArrayList<>(Arrays.asList(
                Month.JUNE,
                Month.JULY,
                Month.AUGUST
        ));
        List<Month> autumn = new ArrayList<>(Arrays.asList(
                Month.SEPTEMBER,
                Month.OCTOBER,
                Month.NOVEMBER
        ));
        if (winter.contains(timeStump.getMonth())) return "winter";
        if (spring.contains(timeStump.getMonth())) return "spring";
        if (summer.contains(timeStump.getMonth())) return "summer";
        if (autumn.contains(timeStump.getMonth())) return "autumn";

        throw new RuntimeException("Невалидная дата");
    }
}

