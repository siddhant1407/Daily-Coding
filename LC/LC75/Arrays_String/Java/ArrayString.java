import java.util.*;


public class ArrayString {
    public static void main (String args[]){
        // // 1. Merge Alternately (Easy- 1768)
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the String1: ");
        // String s1 = sc.nextLine();
        // System.out.print("Enter the String2: ");
        // String s2 = sc.nextLine();    
        // System.out.println("The joined string is: " + mergeAlternately(s1, s2));

        // 2.  Greatest Common Divisor of Strings (Easy- 1071)
        // System.out.println("The GCD of String is: " + gcdOfString(s1, s2));

        // 3. Kids With the Greatest Number of Candies (Easy - 1431)
        // int [] candies = {2,3,5,1,3};
        // int  extraCandies = 3;
        // System.out.println("The Boolean array denoting the result is: " + kidsWithCandies(candies, extraCandies));

        // 4. Can Place Flowers (Easy- 605)
        // int [] flowerbed = {1,0,0,0,0,0,1};
        // int n = 2;
        // System.out.println("Can "+ n +" new flowers be placed: "  +canPlaceFlowers(flowerbed, n));

        // 5. Reverse Vowels of a String (Easy- 345)
        // System.out.print("Enter the String: ");
        // String s1 = sc.nextLine();
        // System.out.println("Reversed vowel String is : " + reverseVowels(s1));

        // // 6. Reverse Words in a String (Medium- 151)
        // System.out.print("Enter the input String: ");
        // String s1 = sc.nextLine();
        // System.out.println("Enter which Method(1,2) you would like to Run: ");
        // int method = sc.nextInt();
        // System.out.println("Reversed Word String is : " + reverseWords(s1,method));

        // // 7. Product of Array Except Self (Medium- 238)
        // int[] nums = {1, 2, 3, 4};
        // int[] result = ArrayString.productExceptSelf(nums);
        // System.out.println("The product of others except the self is: " + Arrays.toString(result));


        // // 8.  Increasing Triplet Subsequence (medium- 334)
        // // int [] nums = {1,2,3,4,5};         // Yes
        // int [] nums = {5,4,3,2,1};          //No
        // boolean res = increasingTriplet(nums);
        // if(res == true){
        //     System.out.println("Yes it has an increasing triplet subsequence");
        // }else{
        //     System.out.println("No it does not have an increasing triplet subsequence");
        // }


        // 9. String Compression (Medium- 443)
        char [] chars = {'a','a','b','b','c','c','c'};
        char[] ans = strCompress(chars, 0, 0);
        System.out.println("The To string ans is: "+ Arrays.toString(ans));
        // sc.close();
    }

    // 1. Merge Alternately (Easy- 1768)
    public static String mergeAlternately(String s1, String s2){
        StringBuilder sb = new StringBuilder();
        int ptr = 0;
        while (ptr < s1.length() || ptr < s2.length()){
            if (ptr < s1.length()){
                sb.append(s1.charAt(ptr));
            }
            if (ptr < s2.length()){
                sb.append(s2.charAt(ptr));
            }
            ptr++;
        }    
        return sb.toString();
    }

    // 2.  Greatest Common Divisor of Strings (Easy- 1071)
    public static String gcdOfString(String str1, String str2) {
        if (!(str1+str2).equals(str2+str1)){
            return "";
        }
        while(!str1.equals(str2)) {
            if (str1.length() > str2.length()) {
                str1 = str1.substring(str2.length());
            } else {
                str2 = str2.substring(str1.length());
            }
        }
        return str1;
    }

    // 3. Kids With the Greatest Number of Candies (Easy - 1431)
    public static List<Boolean> kidsWithCandies(int [] candies, int extraCandies){
        List<Boolean> result = new ArrayList<>();
        int max_num = 0;   //you can set this to Integer.MIN_VALUE; (for the lowest int value initialization)

        for (int candy : candies){
            max_num = Math.max(max_num,candy);
        }

        for (int candy: candies){
            if (candy + extraCandies >= max_num){           // result.add(candy + extraCandies >= maxNum); ~ in one line.
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }


    // 4. Can Place Flowers (Easy- 605)
    public static boolean canPlaceFlowers(int [] flowerbed, int n){
        if (n == 0){
            return true;
        }

        for (int i =0; i<flowerbed.length;i++){
            if (flowerbed[i] == 0){
                if (i == 0 || flowerbed[i-1]==0){
                    if (i == (flowerbed.length-1) || flowerbed[i+1] ==0){
                        flowerbed[i] = 1;
                        --n;
                        if (n==0){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    // 5. Reverse Vowels of a String (Easy- 345)
    public  static String reverseVowels(String s){
        Set<Character>  vowels = new HashSet<>(Arrays.asList('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'));
        char[] s_chararr = s.toCharArray();
        int leftptr = 0;
        int rightptr = s_chararr.length - 1;

        while (leftptr < rightptr){
            if (!vowels.contains(s_chararr[leftptr])){
                leftptr++;
            } else if(!vowels.contains(s_chararr[rightptr])) {
                rightptr--;
            }else {
                char temp = s_chararr[leftptr];
                s_chararr[leftptr] = s_chararr[rightptr];
                s_chararr[rightptr] = temp;
                leftptr++ ; rightptr--;
            }
        }
        return new String(s_chararr);
    }

    // 6. Reverse Words in a String (Medium- 151)
    public static String reverseWords(String s, int method) {
        String[] words = s.split("\\s+");
        if (method == 1){
            // approach 1: using collections
            Collections.reverse(Arrays.asList(words));
            return String.join(" ", words);
        }
        else {
            // approach 2: using stringbuilder reverse operations
            StringBuilder sb = new StringBuilder();

            for (int i = words.length-1; i>=0; i-- ){
                sb.append(words[i]);
                if (i > 0){
                    sb.append(" ");
                }
            }
            return sb.toString();
        }        
    }


    // 7. Product of Array Except Self (Medium- 238)
    public static int[] productExceptSelf(int [] nums){
        // an array to store the results
        int [] result = new int[nums.length];
        Arrays.fill(result, 1);

        // Initialize the 'pre' variable to 1
        int pre = 1;
        // Calculate the product of all elements to the left of the current element
        for (int i = 0; i < nums.length; i++) {
            // Multiply the current element of 'ans' by the value of 'pre'
            result[i] *= pre;
            // Update 'pre' by multiplying it with the current element of 'nums'
            pre *= nums[i];
        }
        // Initialize the 'post' variable to 1
        int post = 1;
        // Calculate the product of all elements to the right of the current element
        for (int j = nums.length - 1; j >= 0; j--) {
            // Multiply the current element of 'ans' by the value of 'post'
            result[j] *= post;
            // Update 'post' by multiplying it with the current element of 'nums'
            post *= nums[j];
        }
        return result;
    }


    // 8.  Increasing Triplet Subsequence (medium- 334)
    public static boolean increasingTriplet(int[] nums){
        int num_i = Integer.MAX_VALUE;
        int num_j = Integer.MAX_VALUE;
       

        for (int num: nums){
            if (num <= num_i){
                num_i = num;
            }
            else if (num <= num_j){
                num_j = num;
            }
            else{
                return true;
            }
        }
        return false;
    }


    // 9. String Compression (Medium- 443)
    public static char[] strCompress(char[] chars, int idx, int write_idx) {
        while(idx < chars.length){
            char curr_char = chars[idx];
            int count = 0;

            while (idx < chars.length && chars[idx] == curr_char) {
                idx++;
                count++;
            }

            chars[write_idx] = curr_char;
            write_idx++;

            if (count > 1){
                for (char c: Integer.toString(count).toCharArray()){
                    chars[write_idx] = c;
                    write_idx++;
                }
            }       
        }
        return chars;
    }

}

