package exercise41.base;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 first_name last_name
 */

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution41 {


    public static void main(String[] args) {
        Solution41 sol = new Solution41();

        String outName = "data\\exercise41_output.txt";
        String fileName = "data\\exercise41_input.txt";
        //call a method called getNames with a parameter of S
        List<String> getNames = sol.getNames(fileName);
        //call a method called sortNames
        List<String> sortNames = sol.sortNames(getNames);
        //call method 'printNamesToOutput'
        sol.printNamesToOutput(sortNames, outName);
    }

    public List<String> getNames(String fI) {

        //try and catch with bufferedReader
        List<String> names = Collections.emptyList();
        try {
            names = Files.readAllLines(Paths.get(fI), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return names;
    }


    public List<String> sortNames(List<String> nameArr) {
        //use collections to sort the array using stream
        List<String> sortedList = nameArr.stream().sorted().collect(Collectors.toList());
        return sortedList;
    }

    public void printNamesToOutput(List<String> sortNames, String oN) {
        //create a try and catch that will print onto the output file
        try {
            PrintStream fileOut = new PrintStream(oN);
            System.setOut(fileOut);
            System.out.print("Total of 7 names\n-----------------\n");
            sortNames.forEach(System.out::println);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return;
    }
}
