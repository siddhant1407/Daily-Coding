import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashSetMap {

    // 1. Find the Difference of Two Arrays [E- 2215]
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // the return format is weird, so create an empty structure to that format for ease.
        List<List<Integer>> res = new ArrayList<>();
        // create 2 lists for two arrays to store unique elements.
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        // add all the unique vals in nums1 list to s1.
        for (int i: nums1){
            s1.add(i);
        }
        // add all the unique vals in nums2 list to s2.
        for (int i: nums2){
            s2.add(i);
        } 

        // create new lists to store the answers.
        List<Integer> l1 = new ArrayList<Integer>();
        List<Integer> l2 = new ArrayList<Integer>();

        // while traversing, if the val in 1 is not present inside 2, add it to the list, if present, then cancel.
        for (int i: s1){
            if (!s2.contains(i)){
                l1.add(i);
            }
        }
        // add the finalized list inside the empty result list.
        res.add(l1);

        // while traversing, if the val in 2 is not present inside 1, add it to the list, if present, then cancel.
        for (int i: s2){
            if (!s1.contains(i)){
                l2.add(i);
            }
        }
        // add the finalized list inside the result list.
        res.add(l2);
        return res;

    }


    // 2. Unique Number of Occurrences [E- 1207]
    public static boolean uniqueOccurrences(int[] arr) {
        // create a hashmap to store the keys and the values(occurances)
        Map <Integer, Integer> occurances = new HashMap<>();

        for (int key: arr){
            // traverse all arr, put the the arr in map-if the value found get it and add'1' or if not found, set the default to zero'0'. 
            occurances.put(key, occurances.getOrDefault(key, 0)+1);
        }

        // create a set to store the uniqu occurances values.
        Set <Integer> unqset = new HashSet<>();
        // travesing thru the keys.
        for (int key: occurances.keySet()){
            // '.get' gets the value for the given 'key'. If occurance val already present, return false.
            if (!unqset.add(occurances.get(key))){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        // 1. Find the Difference of Two Arrays [E- 2215]
        int [] nums1 = {1,2,3};
        int [] nums2 = {2,4,6};
        System.out.println("The difference is (unique to their sets): "+findDifference(nums1, nums2));


        // 2. Unique Number of Occurrences [E- 1207]
        int [] arr = {1,2,2,1,1,3};
        System.out.println("Are the occurance unique?- "+uniqueOccurrences(arr));
    }
    
}
