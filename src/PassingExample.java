import java.util.Arrays;

public class PassingExample {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        printArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void printArray(int[] num) {
        num[0] = 18;

    }
}
