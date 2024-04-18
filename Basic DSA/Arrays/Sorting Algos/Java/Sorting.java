public class Sorting{

    public static void printArray(int arr[]){
        for (int i =0; i<arr.length ;i++){
            System.out.print(arr[i]+ " ");
    }
    // System.out.println();
}

    // 4. Merge Sort: Divide and Conquer Algorithm
    // Time Complexity : O(nlogn)
    // Space Complexity : O(1)
    public static void mergeSort_Divide(int[] array, int start, int end){
        // 4.1 Divde
        if (start < end){
            int mid = start + (end-start)/2;   //(start + end)/2;
            mergeSort_Divide(array , start , mid);
            mergeSort_Divide(array , mid+1 ,end);

            // calling to 4.2 Conquer
            merge(array , start , mid , end);
        }
    }
    
    private static void merge(int[] arr , int start , int mid , int end){
        // new arrays to store the data of array in sorted order.
        int [] merged = new int[end - start + 1];
    
        // Initialize 3 pointers, one for left side array, one for right side array and one for tracking in the new array.
        int idx1 = start, idx2 = mid + 1;
        int k = 0;   //operation on the new array
    
        while (idx1 <= mid && idx2 <= end) {
           if (arr[idx1] <= arr[idx2]) {
               merged[k] = arr[idx1];
               idx1++;
           }
           else {
                merged[k] = arr[idx2];
                idx2++;
           }
           k++;
        }
        
        // Copy remaining elements from the left subarray, if any
        while (idx1 <= mid) {
            merged[k] = arr[idx1];
            idx1++;
            k++;
        }
        // Copy remaining elements from the right subarray, if any
        while (idx2 <= end) {
            merged[k] = arr[idx2];
            idx2++;
            k++;
        }
    
        // Transfer the sorted elements back to the original array.
        for (int i = 0, j = start; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }
    

    public static void main(String[] args) {

        // 1. Bubble Sort:
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


        // 2. Selection Sort:
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


        // 3. Insertion Sort:
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


        // 4. Merge Sort:
        int [] arr4 = {6,5,7,1,9,8};
        int n = arr4.length;
        System.out.println("\nMerge Sort:");
        mergeSort_Divide(arr4, 0, n - 1);
        printArray(arr4);

    }
}
