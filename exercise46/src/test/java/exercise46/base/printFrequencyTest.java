package exercise46.base;

import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class printFrequencyTest {

    @Test
    void testFPrint() {
        printFrequency pF = new printFrequency();
        String testString = "dog dog cat dog lizard dog cat cat lizard zebra";

        Map<String, String> mpExpected = new TreeMap<>();
        mpExpected.put("dog", "****");
        mpExpected.put("cat", "***");
        mpExpected.put("lizard","**");
        mpExpected.put("zebra","*");

        assertEquals(mpExpected, pF.fPrint(testString));
    }

}