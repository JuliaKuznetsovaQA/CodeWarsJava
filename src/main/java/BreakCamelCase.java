public class BreakCamelCase {
    public static void main(String[] args) {
//        Complete the solution so that the function will break up camel casing, using a space between words.
    }

    public static String camelCase(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != input.toLowerCase().charAt(i) && i != 0) {
                result += " " + input.charAt(i);
            } else {
                result += input.charAt(i);
            }
        }
        return result;
    }
}
