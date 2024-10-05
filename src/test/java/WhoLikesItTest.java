import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WhoLikesItTest {

    @Test
    public void testWhoLikesIt() {
        assertEquals(WhoLikesIt.whoLikesIt(),"no one likes this");
        assertEquals(WhoLikesIt.whoLikesIt("Peter"), "Peter likes this");
        assertEquals("Jacob and Alex like this", WhoLikesIt.whoLikesIt("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", WhoLikesIt.whoLikesIt("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", WhoLikesIt.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }
}