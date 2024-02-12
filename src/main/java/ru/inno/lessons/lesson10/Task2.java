package ru.inno.lessons.lesson10;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Task2 {
    public static void main(String[] args) {
        LocalDate publishDate = LocalDate.now().minusDays(1);
        LocalTime publishTime = LocalTime.now().minusHours(0).minusMinutes(1);
        LocalDateTime publishDateTime = LocalDateTime.of(publishDate, publishTime);
        HumanReadableTimestamp timestamp = new HumanReadableTimestampImpl();
        System.out.println(timestamp.getTimestamp(publishDateTime));
    }
}
