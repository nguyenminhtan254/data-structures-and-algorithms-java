
package HTLeetCodeExercises.HTFindDuplicates;

import java.util.*;

public class Main {

public static List<Integer> findDuplicates(int[] nums) {
        Map<Integer, Integer> numCounts = new HashMap<>();
        for (int num : nums) {
            numCounts.put(num, numCounts.getOrDefault(num, 0) + 1);
        }
        List<Integer> duplicates = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : numCounts.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }
        return duplicates;
    }

    public static void main(String[] args) {
        System.out.println("These tests confirm findDuplicates() correctly");
        System.out.println("identifies all elements that occur more than once.");
        System.out.println();

        // Test 1: Single duplicate
        System.out.println("Test 1: Single Duplicate");
        int[] nums1 = {1, 2, 3, 2};
        System.out.println("Expected: [2]");
        System.out.println("Actual: " + findDuplicates(nums1));
        System.out.println();

        // Test 2: No duplicates
        System.out.println("Test 2: No Duplicates");
        int[] nums2 = {1, 2, 3, 4};
        System.out.println("Expected: []");
        System.out.println("Actual: " + findDuplicates(nums2));
        System.out.println();

        // Test 3: Multiple duplicates
        System.out.println("Test 3: Multiple Duplicates");
        int[] nums3 = {1, 2, 2, 3, 3, 4};
        System.out.println("Expected: [2, 3] (order may vary)");
        System.out.println("Actual: " + findDuplicates(nums3));
        System.out.println();

        // Test 4: All elements are duplicates
        System.out.println("Test 4: All Elements Duplicates");
        int[] nums4 = {5, 5, 5, 5};
        System.out.println("Expected: [5]");
        System.out.println("Actual: " + findDuplicates(nums4));
        System.out.println();

        // Test 5: Empty array
        System.out.println("Test 5: Empty Array");
        int[] nums5 = {};
        System.out.println("Expected: []");
        System.out.println("Actual: " + findDuplicates(nums5));
        System.out.println();

        /*
            EXPECTED OUTPUT:
            ----------------
            These tests confirm findDuplicates() correctly
            identifies all elements that occur more than once.

            Test 1: Single Duplicate
            Expected: [2]
            Actual: [2]

            Test 2: No Duplicates
            Expected: []
            Actual: []

            Test 3: Multiple Duplicates
            Expected: [2, 3] (order may vary)
            Actual: [2, 3]

            Test 4: All Elements Duplicates
            Expected: [5]
            Actual: [5]

            Test 5: Empty Array
            Expected: []
            Actual: []
        */
        
    }
    
}