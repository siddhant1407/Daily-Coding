public class Sorting{

    public static void printArray(int arr[]){
        for (int i =0; i<arr.length ;i++){
            System.out.print(arr[i]+ " ");
    }
    // System.out.println();
}
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};
        System.out.print("Bubble Sort: ");

        // BUBBLE SORT
        // Time Complex: O(n^2)
        for (int i=0; i<arr.length-1; i++){
            for (int j=0; j<arr.length-i-1; j++)
                if (arr[j] > arr[j+1]){
                    // swap arr[i] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        }
        printArray(arr);


        System.out.println();
        System.out.print("Selection Sort: ");

        // SELECTION SORT   
        // Time Complexity : O(n^2)
        for (int i=0; i<arr.length-1; i++){
            int smallest = i;
            for (int j=i+1; j<arr.length; j++){
                if (arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            // Swap the elements
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;     
        }
        printArray(arr);


        System.out.println();
        System.out.print("Insertion Sort: ");

        for (int i = 1; i<arr.length; i++){
            int key = arr[i];
            int j = i-1;

            while (j >=0 && key <  arr[j]){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }   
        printArray(arr);

    }
        
}
