package ru.inno.lessons.lesson9;


import java.util.HashMap;
import java.util.Map;

public class Task6 {
    public static void main(String[] args) {

        Map<Player, Integer> points = new HashMap<>();

        points.put(new Player(1, "player1", true), 2);
        points.put(new Player(2, "player2", true), 0);
        points.put(new Player(3, "player3", true), 0);
        points.put(new Player(4, "player4", true), 0);
        points.put(new Player(5, "player5", true), 0);
        points.put(new Player(6, "player6", true), 0);
        points.put(new Player(7, "player7", true), 0);
        points.put(new Player(8, "player8", true), 0);
        points.put(new Player(9, "player9", true), 0);
        points.put(new Player(10, "player10", true), 0);

       int i =  points.get(new Player(1, "player1", true));
        System.out.println(i);
    }
}
