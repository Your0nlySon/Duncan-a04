package exercise45.base;

import java.util.Scanner;

public class askFileName {

    private static final Scanner in = new Scanner(System.in);

    public String askFN() {
        System.out.println("What do you want to name your output file? ");
        String fileName = in.nextLine();
        return fileName;
    }
}
