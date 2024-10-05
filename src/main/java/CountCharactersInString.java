import java.util.HashMap;
import java.util.Map;

public class CountCharactersInString {

//    The main idea is to count all the occurring characters in a string.
//    If you have a string like aba, then the result should be {'a': 2, 'b': 1}.
//    What if the string is empty? Then the result should be empty object literal, {}

    public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> result = new HashMap<>();
        for (Character ch: str.toCharArray()) {
            if (result.containsKey(ch)) {
                int i = result.get(ch);
                result.put(ch, i + 1);
            } else {
                result.put(ch, 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
