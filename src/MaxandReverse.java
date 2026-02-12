import java.util.Arrays;
public class MaxandReverse {
    public static void main(String[] args) {
        int[] arr = {10,30,50,70,90};
        int maxElement = maxRange(arr,0,4);
        System.out.println("maxElement is "+maxElement);
        reverse(arr,0,arr.length-1);



    }
    static int maxRange(int[] arr,int start,int end){
        int maxVal = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }

        }
        return maxVal;
    }
    static void reverse(int[] arr,int start,int end) {
        start = arr[0];
        end = arr.length - 1;
        while (start < end) {
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr,int start,int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
