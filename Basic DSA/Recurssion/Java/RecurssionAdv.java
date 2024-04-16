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



    public static void main (String[] args) {

        // // Q1. Print all the permutations of a string.
        // String str = "abc";
        // printPermutation(str, "");


        // // Q2. CountPathMaze (can only move right ot down)
        // int n = 3; int m = 3;
        // System.out.println("Number of paths to reach bottom right corner: "+countPath(m, n, 0, 0));


        // Q3. Tiling problem- Place Tiles of size 1 x m in a floor of size n x m.
        int n = 4; int m = 2;
        System.out.println("Number of ways to tile the floor using given dimensions: "+placeTiles(n, m));

    }
    
}
