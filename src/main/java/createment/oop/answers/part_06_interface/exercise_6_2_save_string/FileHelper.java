package createment.oop.answers.part_06_interface.exercise_6_2_save_string;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileHelper {

    public static String load(String filename) {
        Path path = Path.of(filename);
        if (Files.exists(path)) {
            try {
                return Files.readString(path);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else
            return null;
    }

    public static void save(String filename, String value) {
        try {
            Files.writeString(Path.of(filename), value);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
