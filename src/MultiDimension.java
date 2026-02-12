import java.util.Scanner;
import java.util.Arrays;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //int[][] arr1 = new int[3][3];
        int[][] arr1 = {
                {1,2,3},
                {3,4,5},
                {6,7,8},

        };



        // input and output of an array while using for loop
        int[][] arr = new int[3][3];
        System.out.println(arr.length);
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = input.nextInt();
                System.out.print(arr[row][col] + " ");

            }
            System.out.println();
        }



    };







}
