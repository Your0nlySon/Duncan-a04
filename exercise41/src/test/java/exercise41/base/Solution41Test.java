package exercise41.base;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution41Test {
    @Test
    void testSorted() {
        Solution41 sol = new Solution41();

        ArrayList<String> newNames = new ArrayList<>() {
            {
                add("Alvin");
                add("Terry");
                add("Charlie");
                add("Christie");
                add ("Tami");
                add("Sarah");
            }
        };
        ArrayList<String> nameSorted = new ArrayList<>() {
            {
                add("Alvin");
                add("Charlie");
                add("Christie");
                add("Sarah");
                add("Tami");
                add("Terry");
            }
        };
        List expected = nameSorted;
        List actual = sol.sortNames(newNames);
        assertEquals(expected, actual);
    }
    @Test
    void fileToArray() {
        Solution41 sol = new Solution41();

        ArrayList<String> fileNames = new ArrayList<>() {
            {
                add("Alvin");
                add("Terry");
                add("Charlie");
                add("Christie");
                add ("Tami");
                add("Sarah");
            }
        };
        List expected = fileNames;
        List actual = sol.getNames("data\\exercise41_testInput.txt");

        assertEquals(expected, actual);
    }
}


