package exercise46.base;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readFile {
    public String fileRead(String fileName) {
        StringBuilder sb = new StringBuilder();
        try
        {
            FileReader reader = new FileReader(fileName);
            BufferedReader buff = new BufferedReader(reader);
            while(true) {
                String inputText = buff.readLine();
                if(inputText == null)
                    break;
                sb.append(' ').append(inputText);
            }
        }
        catch (IOException ex)
        {
            System.out.println("Can't read file.");
        }
        String allFile = sb.toString();
        return allFile.substring(0, 0) + allFile.substring(0 + 1);
    }
}
