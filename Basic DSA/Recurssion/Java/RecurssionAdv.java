public class RecurssionAdv {

    // Q1. Print all the permutations of a string.
    // No idx because, idx is only used when you can break down a problem into smaller, similar subproblems, and solving each subproblem leads you closer to the solution.
    public static void printPermutation(String str, String Permu) {
        // base case- if the recurssion finally reduces to zero.
        if  (str.length() == 0) {
            System.out.println(Permu);
            return;
        }
        for (int i =0; i<str.length();i++){
            char curr_char = str.charAt(i);

            // remove current character from string and only include chars remaining on the left and right. 
            String rest_string = str.substring(0,i) + str.substring(i+1);

            // recursively call the function with remaining characters.
            printPermutation(rest_string, Permu+curr_char);
        }
    }


    public static void main (String[] args) {

        // Q1. Print all the permutations of a string.
        String str = "abc";
        printPermutation(str, "");
    }
    
}
