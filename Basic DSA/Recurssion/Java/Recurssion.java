public class Recurssion {

    // 1. Print number 1 to 5 (Vice Versa)
    public static void printNum(int n){
        if (n == 0){
            return;
        }

        // It will print the first number.
        System.out.print(n + " ");

        // Recursive call- in this this will keep printing until it reaches to base condition i.e., when n becomes 0.
        // Calling itself to print "ALL" remaining numbers (don't think how all are considered, just know all will be printed.).
        printNum(n-1);          //  (n+1) for vice versa
    }

    // Print sum of first n natural numbers
    public static void printSum(int i, int n, int sum){
        if  (i > n){
            System.out.println("The final sum is: "+sum);
            return;
        }

        sum +=  i;                   // Add current value to sum
        System.out.println("Value at : "+i+" Sum is: "+sum);         // Displaying the value and its corresponding sum
        printSum(i + 1 , n, sum);       // Call recurs
    }
    public static void main (String[] args) {
        // // 1. Print number 1 to 5 (Vice Versa)
        // int n = 10;
        // System.out.println("Decreasing nums from is:");
        // printNum(n);

        
        // 2. Print Sum of first n natural numbers
        int n = 6;
        System.out.println("\n\nSum of first "+n+" natural numbers are:");
        printSum(1, n,  0);           // Start with 1 and call recursively
    }
}
