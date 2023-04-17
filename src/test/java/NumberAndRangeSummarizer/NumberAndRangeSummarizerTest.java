package NumberAndRangeSummarizer;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;

class NumberAndRangeSummarizerTest extends TestCase {

    @Test
    void testCollect() {
        NumberAndRangeSummarizer nrs = new NumberAndRangeSummarizer();
        String input = "1,2,3,4,5";

        Collection<Integer> expectedOutput = Arrays.asList(1, 2, 3, 4, 5);
        Collection<Integer> output = nrs.collect(input);
        assertEquals(expectedOutput, output);
    }

    @Test
    void testCollectWithEmptyString() {
        NumberAndRangeSummarizer nrs = new NumberAndRangeSummarizer();
        String input = "";

        Collection<Integer> expectedOutput = Arrays.asList();
        Collection<Integer> output = nrs.collect(input);
        assertEquals(expectedOutput, output);
    }

    @Test
    void testCollectWithInvalidInput() {
        NumberAndRangeSummarizer nrs = new NumberAndRangeSummarizer();
        String input = "1,2,3,abc,4,5";
        nrs.collect(input);
    }

    @Test
    void summarizeCollection() {
    }
}