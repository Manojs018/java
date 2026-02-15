package src;

public class EvenNoOfDigits {
    public static void main(String[] args) {
        int [] arr = {12,35,543,9832,123456};
        System.out.println(findEvenNoOfDigits(arr));

    }
    static int findEvenNoOfDigits(int[] nums){
        int count = 0;
        for(int num : nums ) {
            if(isEven(num)) {
                count++;
            }
        }
        return count;
    }
    static boolean isEven(int n){
        int noOfDigits = digit(n);
        if(noOfDigits % 2 == 0){
            return true;
        }
        return false;

    }
    static int digit(int num) {
        int count = 0;
        if (num < 0) {
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }
        while (num > 0){
            count++;
            num /= 10;
        }
        return count;
    }
}
