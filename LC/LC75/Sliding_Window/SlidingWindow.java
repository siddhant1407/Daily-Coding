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

    public static void main (String[] args) {

        // 1. Maximum Average Subarray I (E- 643)
        int [] nums = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println("The maximum average of given k is: "+ findMaxAverage(nums, k));
    }
}