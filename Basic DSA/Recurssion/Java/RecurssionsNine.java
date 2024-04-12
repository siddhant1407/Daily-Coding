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


        // // Q4. Check if an array is sorted (strictly increasing). - O(n)
        // int [] inputs = {1, 2, 3, 4, 5};
        // boolean result = isSortedStrictlyIncreasing(inputs, 0);
        // if (result == true){
        //     System.out.println("Array is strictly increasing.");
        // } else{
        //     System.out.println("Array is NOT strictly increasing.");
        // }


        // // Q5. Move all ‘x’ to the end of the string. - O(n)
        // String input_string = "abcxxdefxxxghi";
        // moveAllXToEnd(input_string, 0, 0, "");


        // Q6. Remove duplicates in a string.
        String str = "abcadbcefghabi";
        removeDuplicates(str, 0, "");

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


    // Q5. Move all ‘x’ to the end of the string. - O(n)
    public static void moveAllXToEnd(String str, int idx, int count, String NewStr){
        // base case
        if (idx == str.length()){
            for (int i = 0; i<count;i++){
                NewStr += 'x';
            }
            System.out.println("All X's to end string is: " + NewStr);
            return;
        }
        
        char curr_char = str.charAt(idx);
        if (curr_char == 'x' || curr_char == 'X'){
            count++;
        }else{
            NewStr += curr_char;
        }
        moveAllXToEnd(str, idx+1, count, NewStr);
    }


    // Q6. Remove duplicates in a string.
    // the omnipresent boolean array map due to declared public static.
    // 26~ because the alphabets counts.
    public static boolean [] map =  new boolean [26];

    public static void removeDuplicates(String str, int idx, String NewStr){
        // base case
        if(str.length()==idx){
            System.out.print(NewStr+"\n");
            return ;
        }
        char curr_char = str.charAt(idx);
        // map[curr_char - 'a'] becz 'a'  is the starting small letter which starts at index 0.
        // so we need to subtract 'a' to find the curr_position inside thr boolean array.
        if (map[curr_char - 'a'] == false){
            map[curr_char - 'a'] = true;
            NewStr += curr_char;
        }
        removeDuplicates(str, idx+1, NewStr);
    }
}
