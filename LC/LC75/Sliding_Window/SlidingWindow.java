import java.util.*;

public class SlidingWindow{

    // 1. Maximum Average Subarray I (E- 643)
    public static double findMaxAverage(int[] nums, int k){
        // get the sum of the first 4 elems first.
        int sum = 0;
        for (int i =0; i<k; i++){
            sum += nums[i];
        }
        // set a maxSum to later compare the maximums.
        int maxNum = sum;
        // SLIDING WINDOW INITIALIZATION.
        int startIdx = 0; int endIdx = k;
        while (endIdx < nums.length){
            // remove SI to move ahead
            sum -= nums[startIdx];
            startIdx++;

            // add next elem to move ahead
            sum += nums[endIdx];
            endIdx++;
            // get the maximum.
            maxNum = Math.max(sum, maxNum);
        }
        return (double) maxNum/k;
    }


    // 2. Maximum Number of Vowels in a Substring of Given Length (M- 1456)
    public static int maxVowels(String s, int k) {
        int maxVow = 0;
        int inWindowVow = 0;

        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        for (int i=0; i<k; i++){
            if (vowels.contains(s.charAt(i))){
                inWindowVow++;
            }
        }
        maxVow = inWindowVow;

        for (int i=k; i<s.length();i++){
            if (vowels.contains(s.charAt(i-k))){
                inWindowVow--;
            }

            if (vowels.contains(s.charAt(i))){
                inWindowVow++;
            }
            maxVow = Math.max(maxVow, inWindowVow);
            if (maxVow == k) break;
        }        
        return maxVow;
    }


    // 3. Max Consecutive Ones III (M- 1004)
    // Window where, if zero count exceeds, start shrink the window ffrom left. (i.e: start++)
    public static int longestOnes(int[] nums, int k) {
        int zeroCount = 0;
        int i= 0; //initial pointer (StartIndex)
        int result = 0;
        // j will traverse and check up with "i"
        for (int j=0; j<nums.length; j++){
            //  If we find a 0 at index "j", then we need to increase the count of zeros.
            if (nums[j]==0){
                //  We keep increasing the pointer until we have "zeroCount" number of 0's
                zeroCount++;
            }
            // if the count of zero is greater than k! increment "i" by one, until it encounters a zero~ then decrement the zeroCount.
            while(zeroCount>k){         // if statement can also be used here!
                if (nums[i] ==0){
                    zeroCount--;
                }
                // keep incrementing i, both: found a zero or non-zero.
                i++;
            }
            //  Keep track of maximum length seen so far. Store the max in result.
            result = Math.max(result, j-i+1);
        }
        return result; 
    }


    // 4. Longest Subarray of 1's After Deleting One Element (M- 1493)
    public static int longestSubarray(int[] nums) {
        int max_len = 0;
        int start = 0;
        int zero_count = 0;

        for (int end=0; end<nums.length; end++){
            if (nums[end] ==0){
                zero_count++;
            }
            while (zero_count >1){
                if (nums[start]==0){
                    zero_count--;
                }
                start++;
            }
            max_len = Math.max(max_len, end-start);
        }
        return max_len;        
    }


    public static void main (String[] args) {

        // 1. Maximum Average Subarray I (E- 643)
        int [] nums = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println("The maximum average of given k is: "+ findMaxAverage(nums, k));


        // 2. Maximum Number of Vowels in a Substring of Given Length (M- 1456)
        String s = "abciiidef"; int k2 = 3;
        System.out.println("The max num of vowels present inside k are: "+ maxVowels(s, k2));


        // 3. Max Consecutive Ones III (M- 1004)
        int [] nums3 = {1,1,1,0,0,0,1,1,1,1,0};
	    int k3 = 2;
	    int ans = longestOnes(nums3, k3);
	    System.out.println(ans);


        // 4. Longest Subarray of 1's After Deleting One Element (M- 1493)
        int [] nums4 = {1,1,0,1};
        System.out.println("The Longest Subarray of 1's After Deleting One Element is: " + longestSubarray(nums4));
    }
}