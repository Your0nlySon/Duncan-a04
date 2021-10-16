package exercise43.base;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class createFilesTest {
    @Test
        void testWebDir() {
        createFiles cF = new createFiles();
            List<String> testWebDir = new ArrayList<>();
            testWebDir.add("Doogle");
            File tmpDir = cF.createWebsite(testWebDir);

            boolean actualExist = tmpDir.exists();
            boolean expectedExist = true;

        assertEquals(expectedExist, actualExist);
    }
}