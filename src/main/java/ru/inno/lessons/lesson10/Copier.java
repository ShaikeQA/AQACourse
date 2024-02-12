package ru.inno.lessons.lesson10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Copier {


    public static void copyTextFile(String currentPath, String newPath) throws IOException {

        Path oldFilePath = Path.of(currentPath);
        Path newFilePath = Path.of(newPath);
        if (Files.exists(newFilePath)) {
            Files.delete(newFilePath);
        }
        Files.copy(oldFilePath, newFilePath);
    }

}
