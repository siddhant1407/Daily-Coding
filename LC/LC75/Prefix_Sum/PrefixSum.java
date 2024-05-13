public class PrefixSum {

    // 1. Find the Highest Altitude (E- 1732)
    public static int largestAltitude(int[] gain){
        int max_height = 0;
        int curr = 0;

        for (int i=0; i<gain.length; i++){
            curr += gain[i];
            max_height = Math.max(max_height, curr);
        }
        return max_height;
    }


    public static void main(String[] args) {
        
        // 1. Find the Highest Altitude (E- 1732)
        int [] gain = {-5,1,5,0,-7};
        System.out.println("The highest altitude is: "+ largestAltitude(gain));


    }
    
    
}
