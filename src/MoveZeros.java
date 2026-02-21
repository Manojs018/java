package src;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0,1,2,0,4,5,6,7};
        int[] ans = zeros(nums);
        System.out.println(ans);

    }
    static  int[] zeros(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }

        }

        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
        return nums;

    }
}
