package exercise45.base;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class writeToFile {

    private static final Scanner in = new Scanner(System.in);

    public void fileWrite(String wordReplace) {
        //ask user for the name of the file
        System.out.println("What do you want to name your output file? ");
        String fileName = in.nextLine();
        //create the file
        File myObj = new File("data/" + fileName +".txt");
        Path filePath = Path.of(String.valueOf(myObj));
        //write wordReplace into the file
        try {
            Files.writeString(filePath, wordReplace);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
