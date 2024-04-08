import java.util.*;


public class ArrayString {
    public static void main (String args[]){
        // // 1. Merge Alternately (Easy- 1768)
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the String1: ");
        // String s1 = sc.nextLine();
        // System.out.print("Enter the String2: ");
        // String s2 = sc.nextLine();    
        // System.out.println("The joined string is: " + mergeAlternately(s1, s2));

        // 2.  Greatest Common Divisor of Strings (Easy- 1071)
        // System.out.println("The GCD of String is: " + gcdOfString(s1, s2));

        // 3. Kids With the Greatest Number of Candies (Easy - 1431)
        int [] candies = {2,3,5,1,3};
        int  extraCandies = 3;
        System.out.println("The Boolean array denoting the result is: " + kidsWithCandies(candies, extraCandies));

        sc.close();
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

}

