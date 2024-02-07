package ru.inno.lessons.lesson9;

import java.util.HashSet;
import java.util.Set;

public class Task5 {
    public static void main(String[] args) {
        Player player1 = new Player(1, "player1", true);
        Player player2 = new Player(2, "player2", false);
        Player player3 = new Player(3, "player3", false);
        Player player4 = new Player(4, "player4", false);
        Player player5 = new Player(5, "player5", false);
        Player player6 = new Player(6, "player6", false);
        Player player7 = new Player(7, "player7", false);
        Player player8 = new Player(8, "player8", false);
        Player player9 = new Player(9, "player9", true);
        Player player10 = new Player(9, "player9", true);

        Set <Player> tournamentPlayers = new HashSet<>();
        tournamentPlayers.add(player1);
        tournamentPlayers.add(player2);
        tournamentPlayers.add(player3);
        tournamentPlayers.add(player4);
        tournamentPlayers.add(player5);
        tournamentPlayers.add(player6);
        tournamentPlayers.add(player7);
        tournamentPlayers.add(player8);
        tournamentPlayers.add(player9);
        tournamentPlayers.add(player10);

        for (Player tournamentPlayer : tournamentPlayers) {
            System.out.println(tournamentPlayer);
        }
    }
}
