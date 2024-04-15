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


    // Q2. CountPathMaze  (can only move right ot down)
    public static int countPath(int m, int n, int i, int j){
        if (i == n || j == m){
            return 0;
        }
        if (i == (n-1) && j == (n-1)){
            return 1;
        }
        // for down motion we can go only one step downwards.
        int down = countPath(m, n, i+1, j);

        // for right motion we can go only one step right.
        int right = countPath(m, n, i, j+1);

        return down + right;
    }


    public static void main (String[] args) {

        // // Q1. Print all the permutations of a string.
        // String str = "abc";
        // printPermutation(str, "");


        // Q2. CountPathMaze (can only move right ot down)
        int n = 3; int m = 3;
        System.out.println("Number of paths to reach bottom right corner: "+countPath(m, n, 0, 0));

    }
    
}
