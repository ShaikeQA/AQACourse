package ru.inno.lessons.exam1.task2;

import java.util.Random;

public class Sensor {

    public static int getAirHumidity() {
        Random random = new Random();
        return random.nextInt(1, 100);

    }

}
