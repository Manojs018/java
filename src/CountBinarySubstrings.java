package src;

public class CountBinarySubstrings {
    public static void main(String[] args) {

        String s = "00110011";
        System.out.println(countBinarySubstrings(s));  // Output: 6
    }
    static int countBinarySubstrings(String s) {

        int previous = 0;
        int current = 1;
        int result = 0;

        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) == s.charAt(i - 1)) {
                current++;
            } else {
                result += Math.min(previous, current);
                previous = current;
                current = 1;
            }
        }

        result += Math.min(previous, current);

        return result;
    }

}

