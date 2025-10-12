
package HTLeetCodeExercises.SetLongestConsecutiveSequence;

import java.util.*;

public class Main {

    public static int longestConsecutiveSequence(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
 
        int longestStreak = 0;
 
        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;
 
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }
 
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
 
        return longestStreak;
    }

    public static void main(String[] args) {
        System.out.println("These tests confirm longestConsecutiveSequence()");
        System.out.println("returns the correct length of the longest");
        System.out.println("sequence of consecutive numbers.");
        System.out.println();

        // Test 1: Typical case
        System.out.println("Test 1: Typical Sequence");
        int[] nums1 = {100, 4, 200, 1, 3, 2};
        System.out.println("Expected: 4 (sequence 1-4)");
        System.out.println("Actual: " + longestConsecutiveSequence(nums1));
        System.out.println();

        // Test 2: No consecutive numbers
        System.out.println("Test 2: No Consecutive Numbers");
        int[] nums2 = {10, 30, 50};
        System.out.println("Expected: 1 (each stands alone)");
        System.out.println("Actual: " + longestConsecutiveSequence(nums2));
        System.out.println();

        // Test 3: All numbers consecutive
        System.out.println("Test 3: All Numbers Consecutive");
        int[] nums3 = {5, 6, 7, 8, 9};
        System.out.println("Expected: 5 (sequence 5-9)");
        System.out.println("Actual: " + longestConsecutiveSequence(nums3));
        System.out.println();

        // Test 4: Includes negatives
        System.out.println("Test 4: Handles Negatives");
        int[] nums4 = {-1, -2, -3, 0, 1};
        System.out.println("Expected: 5 (sequence -3 to 1)");
        System.out.println("Actual: " + longestConsecutiveSequence(nums4));
        System.out.println();

        // Test 5: Empty array
        System.out.println("Test 5: Empty Array");
        int[] nums5 = {};
        System.out.println("Expected: 0");
        System.out.println("Actual: " + longestConsecutiveSequence(nums5));
        System.out.println();

        /*
            EXPECTED OUTPUT:
            ----------------
            These tests confirm longestConsecutiveSequence()
            returns the correct length of the longest
            sequence of consecutive numbers.

            Test 1: Typical Sequence
            Expected: 4 (sequence 1-4)
            Actual: 4

            Test 2: No Consecutive Numbers
            Expected: 1 (each stands alone)
            Actual: 1

            Test 3: All Numbers Consecutive
            Expected: 5 (sequence 5-9)
            Actual: 5

            Test 4: Handles Negatives
            Expected: 5 (sequence -3 to 1)
            Actual: 5

            Test 5: Empty Array
            Expected: 0
            Actual: 0
        */
        
    }
    
}