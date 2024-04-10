public class Recurssion {

    public static void main (String[] args) {
        // // 1. Print number 1 to 5 (Vice Versa)
        // int n = 10;
        // System.out.println("Decreasing nums from is:");
        // printNum(n);

        
        // // 2. Print Sum of first n natural numbers
        // int n = 6;
        // System.out.println("\n\nSum of first "+n+" natural numbers are:");
        // printSum(1, n,  0);           // Start with 1 and call recursively


        // // 3. Print Fibonachi USING Recurssion
        // int first = 0, second = 1;
        // int n = 10;
        // System.out.print(first + ", ");     // Print First Number
        // System.out.print(second);
        // fiboRecursion(first, second, n-2);


        // // 4. Print x^n (with stack height = n) 
        // int x = 2, n = 5; 
        // int output = printPower(x, n); 
        // System.out.println("The answer for x^n (with stack height = n) is: " + output); 


        // 5. Print x^n (with stack height = logn) 
        int x = 2, n = 5; 
        int output = printPowerlog(x, n); 
        System.out.println("the answer ffor x^n (with stack height = logn) is: " + output); 

    }

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

    // 2. Print sum of first n natural numbers
    public static void printSum(int i, int n, int sum){
        if  (i > n){
            System.out.println("The final sum is: "+sum);
            return;
        }

        sum +=  i;                   // Add current value to sum
        System.out.println("Value at : "+i+" Sum is: "+sum);         // Displaying the value and its corresponding sum
        printSum(i + 1 , n, sum);       // Call recurs
    }


    // 3. Print Fibonachi USING Recurssion
    public static void fiboRecursion(int first, int second, int n){
        if (n==0){
            return;
        }
        int next = first + second;
        System.out.print(", "+next);
        fiboRecursion(second, next, (n-1));
    }

    // 4. Print x^n (with stack height = n) 
    public static int printPower(int x, int n) { 
        if(n == 0) { 
            return 1; 
        } 
        if(x == 0) { 
            return 0; 
        }

        int xPowNmOne = printPower(x, n-1); 
        int x_powN = x * xPowNmOne; 
        return x_powN; 
    }


    // 5. Print x^n (with stack height = logn) 
    public static int printPowerlog(int x, int n) { 
        if(n == 0) { 
            return 1; 
        } 

        if(n % 2 == 0) { 
            return printPower(x, n/2) * printPower(x, n/2); } 
        else { 
            return x * printPower(x, n/2) * printPower(x, n/2); } 
        } 
        
}
