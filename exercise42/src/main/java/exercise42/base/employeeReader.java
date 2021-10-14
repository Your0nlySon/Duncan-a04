package exercise42.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class employeeReader {

    public void rEmployee(File file, Scanner read, List<List<String>> employee) {
        //try
        //catch
            //stackTrace
        try {
            //call read and then scan the file
            read = new Scanner(file);

            while (read.hasNext()) {
                //read line from file and add it to a string array but split it by ,
                String line = read.next();
                String[] values = line.split(",");
                //add the result to the arrayList employee
                employee.add(Arrays.asList(values));
            }
            read.close();
        } catch (FileNotFoundException e) {
            //catch
            //stackTrace
            e.printStackTrace();
        }
    }
}
