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
        // int [] candies = {2,3,5,1,3};
        // int  extraCandies = 3;
        // System.out.println("The Boolean array denoting the result is: " + kidsWithCandies(candies, extraCandies));

        // 4. Can Place Flowers (Easy- 605)
        // int [] flowerbed = {1,0,0,0,0,0,1};
        // int n = 2;
        // System.out.println("Can "+ n +" new flowers be placed: "  +canPlaceFlowers(flowerbed, n));

        // 5. Reverse Vowels of a String (Easy- 345)
        System.out.print("Enter the String: ");
        String s1 = sc.nextLine();
        System.out.println("Reversed vowel String is : " + reverseVowels(s1));

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

}

