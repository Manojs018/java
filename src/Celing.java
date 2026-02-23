package src;



public class Celing {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,15,17,18,46,56};
        int target = 45;
        int ans = celing(arr,target);
        System.out.println(ans);

    }

    static int celing(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start)/2;

            if (target < arr[mid]) {
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid + 1;

            }else {
                return mid;
            }
        }
        return start;
    }
}