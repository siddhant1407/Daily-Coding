// import java.util.Arrays;

public class TwoPointers {

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

    // Is Subsequence (Medium - 392)
    public static boolean isSubsequence(String s, String t) {
        int ptr_s = 0;
        int ptr_t = 0;

        while ((ptr_s < s.length()) && (ptr_t < t.length())) {
            if (s.charAt(ptr_s) == t.charAt(ptr_t)) {
                ptr_s += 1;
            }
            ptr_t += 1;
        }
        return ptr_s == s.length();
    }
    
    public static void main (String[] args) {

        // // 1. Move Zeroes (Easy- 283)
        // int nums[] = {0, 1, 0, 3,  12};
        // int result [] = moveZeros(nums);
        // System.out.println("The Array after moving all zeros is: "+Arrays.toString(result));


        // Is Subsequence (Medium - 392)
        String s = "axc"; String  t = "ahbgdc";
        System.out.println("Is \""+s+"\" a subsequence of \""+t+"\"?~ "+isSubsequence(s, t));

    }
}
