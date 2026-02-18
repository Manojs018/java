package src;

public class AlternatingBits {

    public static boolean hasAlternatingBits(int n) {

        int previousBit = n & 1;   // get last bit
        n = n >> 1;                // shift right

        while (n > 0) {
            int currentBit = n & 1;

            if (currentBit == previousBit) {
                return false;
            }

            previousBit = currentBit;
            n = n >> 1;
        }

        return true;
    }

    public static void main(String[] args) {

        int n = 5;
        System.out.println(hasAlternatingBits(n));  // true
    }
}



