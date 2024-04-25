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


    public static void main (String[] args) {

        // 1. Maximum Average Subarray I (E- 643)
        int [] nums = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println("The maximum average of given k is: "+ findMaxAverage(nums, k));


        // 2. Maximum Number of Vowels in a Substring of Given Length (M- 1456)
        String s = "abciiidef"; int k2 = 3;
        System.out.println("The max num of vowels present inside k are: "+ maxVowels(s, k2));


    }
}