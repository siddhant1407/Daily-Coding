import java.util.Arrays;

public class TwoPointers {
    public static void main (String[] args) {

        // 1. Move Zeroes (Easy- 283)
        int nums[] = {0, 1, 0, 3,  12};
        int result [] = moveZeros(nums);
        System.out.println("The Array after moving all zeros is: "+Arrays.toString(result));


    }

    // 1. Move Zeroes (Easy- 283)
    public static int [] moveZeros(int[] nums){
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                // Swap non-zero element with the leftmost zero element
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
        return nums;

    }
}
