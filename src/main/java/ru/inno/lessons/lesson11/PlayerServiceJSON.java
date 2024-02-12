package ru.inno.lessons.lesson11;

import java.util.ArrayList;
import java.util.Collection;


public class PlayerServiceJSON implements PlayerService {

    private int ID = 0;

    private final Collection<Player> PLAYERS = new ArrayList<>();

    @Override
    public Player getPlayerById(int id) {
        for (Player player : PLAYERS) {
            if (player.getId() == id){
                return player;
            }
        } throw new RuntimeException("Игрока не существует");
    }

    @Override
    public Collection<Player> getPlayers() {
        return PLAYERS;
    }

    @Override
    public int createPlayer(String nickname) {
        ID++;
        getPlayers().add(new Player(ID, nickname, 0, true));
        return ID;
    }

    @Override
    public Player deletePlayer(int id) {
        for (Player player : PLAYERS) {
            if (player.getId() == id){
                PLAYERS.remove(player);
                return player;
            }
        } throw new RuntimeException("Игрока не существует");
    }

    @Override
    public int addPoints(int playerId, int points) {
        for (Player player : PLAYERS) {
            if (player.getId() == playerId){
               player.setPoints(player.getPoints() + points);
               return player.getPoints();
            }
        } throw new RuntimeException("Игрока не существует");
    }
}
