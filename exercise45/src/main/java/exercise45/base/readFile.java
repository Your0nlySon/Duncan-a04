package exercise45.base;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class readFile {
    public String fileRead(String fileName) {
        //create string called fileString and read the content and return that string
        String fileString = null;
        try {
            fileString = Files.readString(Path.of(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileString;
    }
}
