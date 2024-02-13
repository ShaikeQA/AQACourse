package ru.inno.lessons.lesson11;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

@Data
@AllArgsConstructor
//@NoArgsConstructor
public class Players {

    private List<Player> Players = new ArrayList<>();

    public Players() {
        Path playersFilePath = Path.of("src/main/java/ru/inno/lessons/lesson11/playersFile.json");
        ObjectMapper mapper = new ObjectMapper();
        try {
            this.Players.addAll(mapper.readValue(playersFilePath.toFile(),
                    new TypeReference<>() {
                    }));
        } catch (Exception e) {
            System.out.println(e + "Невалидное содержимое файла:" + playersFilePath + "!!! СОЗДАЕМ НОВЫЙ СЕРВАК !!!");
        } finally {
            if (Players.isEmpty()) {
                Players.add(new Player(0, "ADMIN", 9999, true));
            }
        }
    }
}
