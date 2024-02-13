package ru.inno.lessons.lesson11;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Player {

    private int id;
    private String nick;
    private int points;
    private boolean isOnline;

}