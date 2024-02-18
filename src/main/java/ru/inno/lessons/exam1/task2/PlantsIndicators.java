package ru.inno.lessons.exam1.task2;

import java.time.LocalDateTime;

public interface PlantsIndicators {

    LocalDateTime getNextWateringDate(LocalDateTime lastWatering);

    LocalDateTime watering();
}
