public class Recurssion {

    public static void printNum(int n){
        if (n == 0){
            return;
        }

        // It will print the first number.
        System.out.print(n + " ");

        // Recursive call- in this this will keep printing until it reaches to base condition i.e., when n becomes 0.
        // Calling itself to print "ALL" remaining numbers (don't think how all are considered, just know all will be printed.).
        printNum(n-1);
    }

    public static void main (String[] args) {
        int n = 10;
        System.out.println("Decreasing nums from is:");
        printNum(n);
    }
}
