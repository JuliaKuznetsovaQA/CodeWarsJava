import org.testng.annotations.Test;

import static org.testng.Assert.*;
public class ReversedStringsTest {

    @Test
    public void testSolution() {

        assertEquals(ReversedStrings.solution("world"), "dlrow");
        assertEquals(ReversedStrings.solution("word"), "drow");
        assertEquals(ReversedStrings.solution(""), "");
    }
}