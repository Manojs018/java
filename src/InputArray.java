import java.util.Scanner;
import java.util.Arrays;

public class InputArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Array of primitives
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        System.out.println(arr[3]);

        // using for loop
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();

            System.out.print(arr[i] + " ");
        }

        // Array of objects
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();

        }
        System.out.println(Arrays.toString(str));

    }
}
