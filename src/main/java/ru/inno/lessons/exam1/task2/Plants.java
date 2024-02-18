package ru.inno.lessons.exam1.task2;

import lombok.*;

import static java.time.LocalDateTime.now;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
abstract class Plants implements PlantsIndicators {
    String name;
    int age;
    LocalDateTime lastWateringTime;

    public void setLastWateringTime(LocalDateTime lastWateringTime) {
        if (lastWateringTime.isBefore(now().plusSeconds(1))) {
            this.lastWateringTime = lastWateringTime;
        } else {
            System.out.println("Невозможно установить дату последнего полива в будущем");
        }
    }
}
