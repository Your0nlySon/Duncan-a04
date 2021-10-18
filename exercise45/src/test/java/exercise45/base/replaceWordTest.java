package exercise45.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class replaceWordTest {

    @Test
        void testReplaceWord() {
        replaceWord rW = new replaceWord();

        String replaceWords = "One should never utilize the word \"utilize\" in writing. Use \"use\" instead.\r\n" +
                "For example, \"She uses an IDE to write her Java programs\" instead of \"She\r\n" +
                "utilizes an IDE to write her Java programs\".";
        String expectedString = "One should never use the word \"use\" in writing. Use \"use\" instead.\r\n" +
                "For example, \"She uses an IDE to write her Java programs\" instead of \"She\r\n" +
                "uses an IDE to write her Java programs\".";

        assertEquals(expectedString, rW.wordReplace(replaceWords));
    }
}