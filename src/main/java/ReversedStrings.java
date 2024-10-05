public class ReversedStrings {

    public static String solution(String str) {
        StringBuilder res = new StringBuilder(str);
        res.reverse();
        return String.valueOf(res);
    }

    public static void main(String[] args) {

    }
}
