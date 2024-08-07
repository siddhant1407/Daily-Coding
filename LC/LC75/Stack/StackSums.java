import java.util.*;
public class StackSums {
    public String decodeString(String s) {
        Stack<Integer> numberCounts = new Stack<>();
        Stack<String> stringCounts = new Stack<>();
        StringBuilder currString = new StringBuilder(); // to store the current string encountered
        int k = 0; // to store the entire current number encountered 

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0');
            } else if (ch == '[') {
                numberCounts.push(k);
                stringCounts.push(currString.toString());
                currString = new StringBuilder();
                k = 0;
            } else if (ch == ']') {
                StringBuilder decString = new StringBuilder(stringCounts.pop());
                int currK = numberCounts.pop();
                for (int i = 0; i < currK; i++) {
                    decString.append(currString);
                }
                currString = decString;
            } else {
                currString.append(ch);
            }
        }
        return currString.toString();
    }

    public static void main(String[] args) {
        StackSums solution = new StackSums();
        String input = "3[a2[bc]]";
        String result = solution.decodeString(input);
        System.out.println("Decoded string: " + result);
    }
    
}
