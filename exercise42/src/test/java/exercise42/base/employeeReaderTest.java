package exercise42.base;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class employeeReaderTest {
    @Test
    void testFileExist() {
        File tmpDir = new File("data\\exercise42_input.txt");
        File nanDir = new File("data\\exercise42_output.txt");
        boolean actualExist = tmpDir.exists();
        boolean actualNANExist = nanDir.exists();
        boolean expectedExist = true;

        assertEquals(expectedExist, actualExist);
        assertNotEquals(expectedExist, actualNANExist);
    }
    @Test
    void fileToArray() {
        employeeReader eR = new employeeReader();
        List<List<String>> empTest = new ArrayList<>();
        File tmpDir = new File("data\\exercise42_input.txt");

        List<List> fileNames = new ArrayList<List>();
        List n1=new ArrayList();
        n1.add("Ling");
        n1.add("Mai");
        n1.add("55900");

        List n2=new ArrayList();
        n2.add("Johnson");
        n2.add("Jim");
        n2.add("56500");

        List n3=new ArrayList();
        n3.add("Jones");
        n3.add("Aaron");
        n3.add("46000");

        List n4=new ArrayList();
        n4.add("Jones");
        n4.add("Chris");
        n4.add("34500");

        List n5=new ArrayList();
        n5.add("Swift");
        n5.add("Geoffrey");
        n5.add("14200");

        List n6=new ArrayList();
        n6.add("Xiong");
        n6.add("Fong");
        n6.add("65000");

        List n7=new ArrayList();
        n7.add("Zarnecki");
        n7.add("Sabrina");
        n7.add("51500");

        fileNames.add(n1);
        fileNames.add(n2);
        fileNames.add(n3);
        fileNames.add(n4);
        fileNames.add(n5);
        fileNames.add(n6);
        fileNames.add(n7);


        List<List> expected = fileNames;
        List<List<String>> actual = eR.rEmployee(tmpDir, empTest);

        assertEquals(expected, actual);
    }
}