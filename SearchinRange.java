public class SearchinRange {
    public static void main(String[] args) {
        int[] nums = {1,-2,3,45,67,23,-90,5};
        int target = -90;
        int ans = LinearSearch(nums, target,2,6);
        System.out.println(ans);



    }

    static int LinearSearch(int[] arr,  int target,int start,int end) {
        if(arr.length == 0) {
            return -1;
        }
        for(int index = start; index <= end; index++) {
            int element = arr[index];
            if(element == target) {
                return index;
            }
        }
        return -1;
    }
}


