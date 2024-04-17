import java.util.ArrayList;

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


    // Q3. Tiling problem- Place Tiles of size 1 x m in a floor of size n x m.
    public static int placeTiles(int n, int m){
        // if n==m, then in last there are only 2 options left for placement.
        // either all tiles will be placed vertically or horizontally.
        if (n==m){return 2;}

        // if n is smaller than m, then in last there is only one option left.
        if (n<m){return 1;}

        // Vertical Placements- as the tile is 1xm (len x breadth), placing a tile vertically inside nxm (len x breadth) grid,
        // means that it's going to cover at (n-m)
        int verPlacements = placeTiles(n-m, m);

        // Horizontal Placements- as the tile is 1xm (len x breadth), placing a tile horizontally inside nxm (len x breadth) grid,
        // means that it's going to cover at (n-1)
        int horPlacements = placeTiles(n-1, m);

        return verPlacements + horPlacements;
    }


    // Q4. Find the number of ways in which you can invite n people to your party, single or in pairs
    public static int numWays(int n){
        // base case- If 1 or less than 1 (i.e: when (n-2) on pair brings 0)
        if (n<=1){return 1;}
        
        //  If there are more than two persons then we have two choices:
        //  1. sinlge invitation, where if a person is invited as a single then, (n-1) people remain to invite.
        //  This is done by recursively calling the function on n-1 below.
        int way1 = numWays(n - 1);

        // 2. pair invitation, where if a pair is coming then, after selecting one person from the pair (n-1) and then
        //  We also have another choice where we include one person and recurse on n-2 above.
        int way2 = (n-1) * numWays(n - 2);

        return way1 + way2;
    }


    // Q.5 Print all the subsets of a set of first n natural numbers
    public static void printSubset(ArrayList<Integer> subset){
        for (int i =0;  i <subset.size(); i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println("");
    }
    public static void findSubsets(int n, ArrayList<Integer> subset){
        // base case
        if (n ==0){
            printSubset(subset);
            return;
        }
        // Case1: To be added
        //  add current element to subset and call findSubsets() with n-1 and current element added.
        subset.add(n);
        findSubsets(n-1, subset);

        // Case2: not to be added
        // remove current element from subset and call findSubsets() with n-1.
        subset.remove(subset.size()-1);   //when added, it appends to the last. So remove the last using the size-1.
        findSubsets(n-1, subset);
    }



    public static void main (String[] args) {

        // // Q1. Print all the permutations of a string.
        // String str = "abc";
        // printPermutation(str, "");


        // // Q2. CountPathMaze (can only move right ot down)
        // int n = 3; int m = 3;
        // System.out.println("Number of paths to reach bottom right corner: "+countPath(m, n, 0, 0));


        // // Q3. Tiling problem- Place Tiles of size 1 x m in a floor of size n x m.
        // int n = 4; int m = 2;
        // System.out.println("Number of ways to tile the floor using given dimensions: "+placeTiles(n, m));


        // // Q4. Find the number of ways in which you can invite n people to your party, single or in pairs
        // int n = 4;
        // System.out.println("The number of ways of invitation (single+pair) total is: "+numWays(n));


        // Q.5 Print all the subsets of a set of first n natural numbers
        int n = 3;
        ArrayList<Integer> subSet = new ArrayList<>();
        findSubsets(n,subSet);
    }
}
