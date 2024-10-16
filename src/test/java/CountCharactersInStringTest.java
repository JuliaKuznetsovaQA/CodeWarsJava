import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;

public class CountCharactersInStringTest {

//    @Test
//    public void testCount() {
    @Test
    public void testEmptyString() {
        Map<Character, Integer> d = new HashMap<>();
        assertEquals(d, CountCharactersInString.count(""));
    }

    @Test
    public void testSingleCharacter() {
        Map<Character, Integer> d = new HashMap<>();
        d.put('a', 1);
        assertEquals(d, CountCharactersInString.count("a"));
    }

    @Test
    public void testMultipleCharacters() {
        Map<Character, Integer> d = new HashMap<>();
        d.put('a', 3);
        d.put('b', 3);
        d.put('c', 1);
        assertEquals(d, CountCharactersInString.count("aabbbac"));
    }

    @Test
    public void testAllCharactersUnique() {
        Map<Character, Integer> d = new HashMap<>();
        d.put('a', 1);
        d.put('b', 1);
        d.put('c', 1);
        assertEquals(d, CountCharactersInString.count("abc"));
    }

    @Test
    public void testAllCharactersSame() {
        Map<Character, Integer> d = new HashMap<>();
        d.put('a', 5);
        assertEquals(d, CountCharactersInString.count("aaaaa"));
    }

    @Test
    public void testDifferentCharacters() {
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('a', 2);
        expected.put('b', 2);
        Map<Character, Integer> actual = CountCharactersInString.count("aabb");
        assertEquals(expected, actual);
    }
}
