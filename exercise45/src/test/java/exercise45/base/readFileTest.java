package exercise45.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class readFileTest {

    @Test
        void testReadFile() {
        readFile rF = new readFile();

        String fileName = "data/exercise44_input.txt";
        String expectedString = "One should never utilize the word \"utilize\" in writing. Use \"use\" instead.\r\n" +
                "For example, \"She uses an IDE to write her Java programs\" instead of \"She\r\n" +
                "utilizes an IDE to write her Java programs\".";
        System.out.println(expectedString);
        System.out.println(rF.fileRead(fileName));

        assertEquals(expectedString, rF.fileRead(fileName));
    }

}