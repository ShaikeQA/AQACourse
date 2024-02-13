package ru.inno.lessons.lesson11;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Collection;
import java.util.List;

public class Task1 {
    public static void main(String[] args) throws IOException {

        PlayerService service = new PlayerServiceJSON();
        int playerId1 = service.createPlayer("WinMaster_11");
        service.createPlayer("WinMaster_1");
        int playerId2 = service.createPlayer("WinMaster_116");
        System.out.println(service.getPlayers());
        service.addPoints(playerId1, 100);
        service.deletePlayer(playerId2);
        Collection<Player> players = service.getPlayers();
        for (Player player : players) {
            System.out.println(player);
        }
    }
}
