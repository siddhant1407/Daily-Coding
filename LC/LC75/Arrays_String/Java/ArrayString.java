import java.util.*;


public class ArrayString {
    public static void main (String args[]){
        // 1. Merge Alternately (Easy- 1768)
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        sc.close();
        System.out.println("The joined string is: " + mergeAlternately(s1, s2));
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


}
