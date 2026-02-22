package src;

public class MissingValue {
    public static int missingNum(int[] arr) {
        int n = arr.length + 1;

        for (int i = 1; i <= n; i++) {
            boolean found = false;
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }

            if (!found)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,2,5,7,6};
        System.out.println(missingNum(arr));
    }
}