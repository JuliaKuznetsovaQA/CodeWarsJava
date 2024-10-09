public class WriteNumberInExpandedForm {
    public static void main(String[] args) {

        System.out.println(expandedForm(120074500));
    }

    public static String expandedForm(int num)
    {
        String numStr = String.valueOf(num);
        String result = "";
        String nulls = "";
        String separator = "";
        for (int i = numStr.length() - 1; i >= 0; i--) {
            if (i < numStr.length() - 1) {
                nulls += "0";
            }
            if (numStr.charAt(i) != '0') {
                result = numStr.charAt(i) + nulls + separator + result;
                separator = " + ";
            }
        }
        return result;
    }
}
