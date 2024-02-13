package ru.inno.lessons.lesson11;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Collection;
import java.util.NoSuchElementException;


public class PlayerServiceJSON implements PlayerService {

    private final Players PLAYERS = new Players();

    private final Path playersFilePath = Path.of("src/main/java/ru/inno/lessons/lesson11/playersFile.json");

    private int ID = PLAYERS.getPlayers().get(PLAYERS.getPlayers().size() - 1).getId();

    @Override
    public Player getPlayerById(int id) {
        for (Player player : PLAYERS.getPlayers()) {
            if (player.getId() == id) {
                return player;
            }
        }
        throw new NoSuchElementException("Игрока не существует c ID: " + id);
    }

    @Override
    public Collection<Player> getPlayers() {
        return PLAYERS.getPlayers();
    }

    @Override
    public int createPlayer(String nickname) throws IOException {
        ID++;
        PLAYERS.getPlayers().add(new Player(ID, nickname, 0, true));
        saveJsonFile();
        return ID;
    }

    @Override
    public Player deletePlayer(int id) throws IOException {
        for (Player player : PLAYERS.getPlayers()) {
            if (player.getId() == id) {
                PLAYERS.getPlayers().remove(player);
                saveJsonFile();
                return player;
            }
        }
        throw new NoSuchElementException("Игрока не существует c ID: " + id);
    }

    @Override
    public int addPoints(int playerId, int points) throws IOException {
        for (Player player : PLAYERS.getPlayers()) {
            if (player.getId() == playerId) {
                player.setPoints(player.getPoints() + points);
                saveJsonFile();
                return player.getPoints();
            }
        }
        throw new NoSuchElementException("Игрока не существует c ID: " + playerId);
    }

    private void saveJsonFile() throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(playersFilePath.toFile(), PLAYERS.getPlayers());

    }
}