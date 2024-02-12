package ru.inno.lessons.lesson10;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAmount;

public class HumanReadableTimestampImpl implements HumanReadableTimestamp {
    @Override
    public String getTimestamp(LocalDateTime eventTimestamp) {
        Duration durationFromPublishPost = Duration.between(eventTimestamp, LocalDateTime.now());
        long daysDuration = durationFromPublishPost.toDays();
        long hoursDuration = durationFromPublishPost.toHours();
        long minutesDuration = durationFromPublishPost.toMinutes();
        // нужно дополнить условия, сделать внутрениии, используя остаток от деления. Или для каждого типа(days, hours, minutes) сделать условие через contains(более легкий способ)
        // но мне лень )
        if (durationFromPublishPost.toMinutes() == 0) {
            return "опубликовано сейчас";
        } else {
            if (daysDuration > 0) {
                return "опубликовано " + daysDuration + " дней назад";
            } else if (hoursDuration > 0) {
                return "опубликовано " + hoursDuration + " часов назад";
            } else {
                return "опубликовано " + minutesDuration + " минут назад";
            }
        }
    }
}
