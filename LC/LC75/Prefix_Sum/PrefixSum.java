public class PrefixSum {

    // 1. Find the Highest Altitude (E- 1732)
    public static int largestAltitude(int[] gain){
        // initialize the max to record the max height and the curr to traverse.
        int max_height = 0;
        int curr = 0;

        for (int i=0; i<gain.length; i++){
            // keep adding the curr to get the latest +/-.
            curr += gain[i];
            max_height = Math.max(max_height, curr);
        }
        return max_height;
    }


    // 2. Find Pivot Index (E- 724)
    public static int pivotIndex(int[] nums) {
        // cal the total sum to later sub equally from left and right.
        int tot_sum = 0;
        for (int num: nums){
            tot_sum += num;
        }

        // inintialize left and right to move-in from both sided.
        int left_sum = 0;
        int right_sum = tot_sum;

        for (int i =0; i<nums.length;i++){
            // keep adding left side
            left_sum += nums[i];

            // check if equal
            if (left_sum == right_sum){
                return i;
            }

            // remove the element on the right side
            right_sum -= nums[i];
        }
        // if no pivot present, return -1
        return -1;
    }


    public static void main(String[] args) {

        // 1. Find the Highest Altitude (E- 1732)
        int [] gain = {-5,1,5,0,-7};
        System.out.println("The highest altitude is: "+ largestAltitude(gain));


        // 2. Find Pivot Index (E- 724)
        int [] nums = {1,7,3,6,5,6};
        System.out.println("Pivot index is at: "+ pivotIndex(nums));


    }
    
    
}
