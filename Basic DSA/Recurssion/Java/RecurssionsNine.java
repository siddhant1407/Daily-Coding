public class RecurssionsNine {
    public static void main (String[] args) {

        // // Q1. Tower of Hanoi - Transfer n disks from source to destination over 3 towers.
        // int n = 3;
        // char source = 'A', destination = 'C', helper = 'B';
        // System.out.println("The Steps/Moves for TOH probem begin");
        // towerOfHanoi(n,source,destination,helper);
        

        // Q2. Print a string in reverse.
        String str = "HelloWorld";
        printRev(str, str.length()-1);

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
}
