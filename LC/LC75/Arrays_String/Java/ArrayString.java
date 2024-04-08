import java.util.*;


public class ArrayString {
    public static void main (String args[]){
        // // 1. Merge Alternately (Easy- 1768)
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String1: ");
        String s1 = sc.nextLine();
        System.out.print("Enter the String2: ");
        String s2 = sc.nextLine();
        sc.close();
        // System.out.println("The joined string is: " + mergeAlternately(s1, s2));

        // 2.  Greatest Common Divisor of Strings (1071)
        System.out.println("The GCD of String is: " + gcdOfString(s1, s2));

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

    // 2.  Greatest Common Divisor of Strings (1071)
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

}

