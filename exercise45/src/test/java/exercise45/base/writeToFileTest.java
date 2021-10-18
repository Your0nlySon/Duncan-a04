package exercise45.base;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class writeToFileTest {

    @Test
        void testWriteToFile() {
            writeToFile wF = new writeToFile();

            String fileName = "fileName";
            String dontNeedString = "dont Need a string for this test";

            File tmpDir = wF.fileWrite(dontNeedString, fileName);

            boolean actualExist = tmpDir.exists();
            boolean expectedExist = true;

            assertEquals(expectedExist, actualExist);
    }

}