package exercise42.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution42 {

    private List<List<String>> employee = new ArrayList<>();
    employeeReader eR = new employeeReader();
    employeeOutput eO = new employeeOutput();
    private String fileName = "data\\exercise42_input.txt";
    File file = new File(fileName);
    private Scanner read;

    public static void main(String[] args) {
        Solution42 sol = new Solution42();

        sol.readEmployee();
        sol.outputEmployee();
    }

    private void readEmployee() {
        eR.rEmployee(file, read, employee);
    }

    private void outputEmployee() {
        eO.oEmployee(employee);
    }
}
