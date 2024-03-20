public class StringTests {
    // Problem 2 Solution
    public static int problemTwo(String s) {
        int count = 0;
        for (int i = 0; i <= s.length() - 3; i++) {
            if (s.substring(i, i + 3).equals("bob")) {
                count++;
            }
        }
        return count;
    }
