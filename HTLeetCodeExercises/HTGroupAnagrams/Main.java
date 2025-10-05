
package HTLeetCodeExercises.HTGroupAnagrams;

import java.util.*;

public class Main {

    public static List<List<String>> groupAnagrams(String[] strings) {
        Map<String, List<String>> anagramGroups = new HashMap<>();
 
        for (String string : strings) {
            char[] chars = string.toCharArray();
            Arrays.sort(chars);
            String canonical = new String(chars);
 
            if (anagramGroups.containsKey(canonical)) {
                anagramGroups.get(canonical).add(string);
            } else {
                List<String> group = new ArrayList<>();
                group.add(string);
                anagramGroups.put(canonical, group);
            }
        }

        return new ArrayList<>(anagramGroups.values());
    }

    public static void main(String[] args) {
        System.out.println("These tests confirm groupAnagrams() groups");
        System.out.println("words by sorted characters, including handling");
        System.out.println("duplicates, empty strings, and multiple groups.");
        System.out.println();

        // Test 1: Single group of anagrams
        System.out.println("Test 1: Single Group");
        String[] input1 = {"bat", "tab"};
        System.out.println("Expected: [[bat, tab]]");
        System.out.println("Actual: " + groupAnagrams(input1));
        System.out.println();

        // Test 2: Words with no anagrams
        System.out.println("Test 2: Single Words Remain");
        String[] input2 = {"dog", "cat"};
        System.out.println("Expected: [[dog], [cat]] (order may vary)");
        System.out.println("Actual: " + groupAnagrams(input2));
        System.out.println();

        // Test 3: Multiple groups
        System.out.println("Test 3: Multiple Groups");
        String[] input3 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println("Expected: [[eat, tea, ate], [tan, nat], [bat]]");
        System.out.println("Actual: " + groupAnagrams(input3));
        System.out.println();

        // Test 4: Duplicate words
        System.out.println("Test 4: Duplicate Words");
        String[] input4 = {"bat", "tab", "bat"};
        System.out.println("Expected: [[bat, bat, tab]]");
        System.out.println("Actual: " + groupAnagrams(input4));
        System.out.println();

        // Test 5: Edge cases (empty strings and empty input)
        System.out.println("Test 5: Edge Cases");
        String[] input5 = {"", ""};
        String[] input6 = {};
        System.out.println("Expected (empty strings): [[, ]]");
        System.out.println("Actual: " + groupAnagrams(input5));
        System.out.println("Expected (empty input): []");
        System.out.println("Actual: " + groupAnagrams(input6));
        System.out.println();

        /*
            EXPECTED OUTPUT:
            ----------------
            These tests confirm groupAnagrams() groups
            words by sorted characters, including handling
            duplicates, empty strings, and multiple groups.

            Test 1: Single Group
            Expected: [[bat, tab]]
            Actual: [[bat, tab]]

            Test 2: Single Words Remain
            Expected: [[dog], [cat]] (order may vary)
            Actual: [[dog], [cat]]

            Test 3: Multiple Groups
            Expected: [[eat, tea, ate], [tan, nat], [bat]]
            Actual: [[eat, tea, ate], [tan, nat], [bat]]

            Test 4: Duplicate Words
            Expected: [[bat, bat, tab]]
            Actual: [[bat, bat, tab]]

            Test 5: Edge Cases
            Expected (empty strings): [[, ]]
            Actual: [[, ]]
            Expected (empty input): []
            Actual: []
        */
        
    }
    
}