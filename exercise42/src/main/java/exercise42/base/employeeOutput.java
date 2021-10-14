package exercise42.base;

import java.util.List;

public class employeeOutput {

    public void oEmployee(List<List<String>> employee) {
        //create lineNo = 1
        //for loop that prints each line of the code underneath a table header
        System.out.println("     Last      First     Salary\n" + "     --------------------------");
        int lineNo = 1;
        for (List<String> line : employee) {
            for (int i = 0; i < 1; i++) {
                System.out.println(String.format("%10s %10s %10s", employee.get(lineNo-1).get(0), employee.get(lineNo-1).get(1), employee.get(lineNo-1).get(2)));
            }
            lineNo++;
        }
    }
}

