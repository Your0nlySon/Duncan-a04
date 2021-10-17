package exercise43.base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestClassOrder;
import org.junit.jupiter.api.TestMethodOrder;

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

            List<String> testJSDir = new ArrayList<>();
            testJSDir.add("y");

            File tmpJSDir = cF.createJS(testWebDir, testJSDir);

            boolean actualExist2 = tmpJSDir.exists();
            boolean expectedExist2 = true;

            assertEquals(expectedExist2, actualExist2);

            List<String> testCSSDir = new ArrayList<>();
            testCSSDir.add("y");

            File tmpCSSDir = cF.createCSS(testWebDir, testCSSDir);

            boolean actualExist3 = tmpCSSDir.exists();
            boolean expectedExist3 = true;

            assertEquals(expectedExist3, actualExist3);
        }
}