package exercise45.base;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class writeToFile {


    public File fileWrite(String wordReplace, String fileName) {

        //create the file
        File myObj = new File("data/" + fileName +".txt");
        Path filePath = Path.of(String.valueOf(myObj));
        //write wordReplace into the file
        try {
            Files.writeString(filePath, wordReplace);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return myObj;
    }
}
