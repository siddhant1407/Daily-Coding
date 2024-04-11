public class RecurssionsNine {
    public static void main (String[] args) {

        // // Q1. Tower of Hanoi - Transfer n disks from source to destination over 3 towers.
        // int n = 3;
        // char source = 'A', destination = 'C', helper = 'B';
        // System.out.println("The Steps/Moves for TOH probem begin");
        // towerOfHanoi(n,source,destination,helper);
        

        // // Q2. Print a string in reverse.
        // String str = "HelloWorld";
        // printRev(str, str.length()-1);


        // // Q3. Find the occurrence of the first and last occurrence of an element using recursion.
        // String str = "abafhodijdah";
        // char elem = 'a';
        // int idx = 0;
        // findFirstLastOccurrenceRecursively(str,elem, idx, -1, -1);


        // Q4. Check if an array is sorted (strictly increasing). - O(n)
        int [] inputs = {1, 2, 3, 4, 5};
        boolean result = isSortedStrictlyIncreasing(inputs, 0);
        if (result == true){
            System.out.println("Array is strictly increasing.");
        } else{
            System.out.println("Array is NOT strictly increasing.");
        }

    }
    
    // Q1. Tower of Hanoi - Transfer n disks from source to destination over 3 towers.
    public static void towerOfHanoi(int n, char source, char destination, char helper){
        if(n==1){
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        // Move top n-1 disks from A to B using C as auxiliary
        towerOfHanoi(n-1, source, helper, destination);

        // Move remaining disk from A to C 
        System.out.println("Move Disk " + n + " from " + source + " to " + destination);

        // Move n-1 disks from B to C using A as auxiliary
        towerOfHanoi(n-1, helper, destination, source);
    }


    // Q2. Print a string in reverse.
    public static void printRev(String s, int idx){
        if (idx == 0){
            System.out.print(s.charAt(idx));
            return;
        }
        System.out.print(s.charAt(idx));
        printRev(s, idx-1);
    }


    // Q3. Find the occurrence of the first and last occurrence of an element using recursion.
    public static void findFirstLastOccurrenceRecursively(String str, char elem, int idx, int first, int last){
        // base cases
        if (idx == str.length()){
            System.out.println("The First  Occurrence is: "+first) ;
            System.out.println("The Last  Occurrence is: "+last) ;
            return;
        }
        if(str.charAt(idx) == elem){
            if(first == -1){
                first = idx;
            }
            else{
                last = idx;
            }
        }
        findFirstLastOccurrenceRecursively(str, elem, idx+1, first, last);
    }


    // Q4. Check if an array is sorted (strictly increasing). - O(n)
    public static boolean isSortedStrictlyIncreasing(int [] arr, int idx){
        if  (idx == arr.length - 1){
            return true;
        }
        if (arr[idx] < arr[idx+1]){
            return isSortedStrictlyIncreasing(arr, idx+1);
        }
        else{
            return false;
        }
    }

}
