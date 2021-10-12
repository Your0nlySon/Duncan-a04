package exercise41.base;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 first_name last_name
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution41 {

    private int arrSize;

    public static void main(String[] args) {
        Solution41 sol = new Solution41();

        //have to throw an exception for the scanner
        Scanner s = null;
        try {
            s = new Scanner(new File("data\\exercise41_input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        ArrayList getNames = sol.getNames(s);
        sol.getSize(getNames);
        ArrayList sortNames = sol.sortNames(getNames);
        sol.printNamesToOutput(sortNames);
    }

    public ArrayList getNames(Scanner fI) {
        //create while loop that will fill up nameArr
        return null;
    }

    private void getSize(ArrayList gN) {
        //arrSize = gN.size()
    }

    public ArrayList sortNames(ArrayList<String> nameArr) {
        //use collections to sort the array in reverse order
        return null;
    }

    private void printNamesToOutput(ArrayList sortNames) {
        //Create a for loop that contains arrSize and nameArr
    }
}
