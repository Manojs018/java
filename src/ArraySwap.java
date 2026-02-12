import java.util.Arrays;
public class ArraySwap {
    public static void main(String[] args) {
        int[] arr = {10,30,50,70,90};
        swap(arr,1,3);
        System.out.println(Arrays.toString(arr));


    }
    static void swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
