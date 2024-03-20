
public class TestClass {
    // Problem 3 Solution
    public static String problemThree(String s) {
        String longest = "";
        String current = "";
        for (int i = 0; i < s.length(); i++) {
            if (current.isEmpty() || s.charAt(i) >= current.charAt(current.length() - 1)) {
                current += s.charAt(i);
            } else {
                if (current.length() > longest.length()) {
                    longest = current;
                }
                current = "" + s.charAt(i);
            }
        }
        if (current.length() > longest.length()) {
            longest = current;
        }
        return longest;
    }