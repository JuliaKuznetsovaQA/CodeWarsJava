import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WriteNumberInExpandedFormTest {

    @Test
    public void testExpandedForm() {
        assertEquals("10 + 2", WriteNumberInExpandedForm.expandedForm(12));
        assertEquals("40 + 2", WriteNumberInExpandedForm.expandedForm(42));
        assertEquals("70000 + 300 + 4", WriteNumberInExpandedForm.expandedForm(70304));
    }
}