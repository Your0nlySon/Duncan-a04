package exercise46.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class readFileTest {

    @Test
    void testReadFile() {
        readFile rF = new readFile();
        String tmpDir = "data/test_input.txt";
        String expectedString = "dog dog cat dog lizard dog cat cat lizard zebra";

        assertEquals(expectedString, rF.fileRead(tmpDir));
    }

}