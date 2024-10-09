import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BreakCamelCaseTest {

    @Test
    public void testCamelCase() {
        assertEquals("camel Casing", BreakCamelCase.camelCase("camelCasing"));
        assertEquals("camel Casing Test", BreakCamelCase.camelCase("camelCasingTest"));
        assertEquals("Camelcasingtest", BreakCamelCase.camelCase("Camelcasingtest"));
        assertEquals("", BreakCamelCase.camelCase(""));
        assertEquals("c", BreakCamelCase.camelCase("c"));
    }
}