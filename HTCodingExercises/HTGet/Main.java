
package HTCodingExercises.HTGet;

public class Main {

    public static void main(String[] args) {
        HashTable table;

        System.out.println("These tests confirm get() retrieves values");
        System.out.println("for existing keys, returns 0 for missing");
        System.out.println("keys, and works with chained buckets.");
        System.out.println();

        // Test 1: Get a single key
        System.out.println("Test 1: Get Single Key");
        table = new HashTable();
        table.set("nails", 100);
        System.out.println("Expected: 100");
        System.out.println("Actual: " + table.get("nails"));
        System.out.println();

        // Test 2: Get multiple keys
        System.out.println("Test 2: Get Multiple Keys");
        table = new HashTable();
        table.set("nails", 100);
        table.set("tile", 50);
        table.set("lumber", 80);
        System.out.println("Expected: tile=50, lumber=80");
        System.out.println("Actual tile: " + table.get("tile"));
        System.out.println("Actual lumber: " + table.get("lumber"));
        System.out.println();

        // Test 3: Get non-existent key
        System.out.println("Test 3: Get Non-Existent Key");
        table = new HashTable();
        table.set("nails", 100);
        System.out.println("Expected: 0");
        System.out.println("Actual: " + table.get("screws"));
        System.out.println();

        // Test 4: Get keys in chained bucket (collisions)
        System.out.println("Test 4: Get Keys with Collisions");
        table = new HashTable();
        table.set("nails", 100);
        table.set("tile", 50);
        table.set("lumber", 80);
        System.out.println("Expected: nails=100, tile=50, lumber=80");
        System.out.println("Actual nails: " + table.get("nails"));
        System.out.println("Actual tile: " + table.get("tile"));
        System.out.println("Actual lumber: " + table.get("lumber"));
        System.out.println();

        // Test 5: Get after many insertions
        System.out.println("Test 5: Get After Many Insertions");
        table = new HashTable();
        for (int i = 0; i < 20; i++) {
            table.set("item" + i, i * 10);
        }
        System.out.println("Expected: 150 for item15");
        System.out.println("Actual item15: " + table.get("item15"));
        System.out.println("Expected: 0 for missing and empty keys");
        System.out.println("Actual missing: " + table.get("missing"));
        System.out.println("Actual empty: " + table.get(""));
        System.out.println();

        /*
            EXPECTED OUTPUT:
            ----------------
            These tests confirm get() retrieves values
            for existing keys, returns 0 for missing
            keys, and works with multiple node in LL.

            Test 1: Get Single Key
            Expected: 100
            Actual: 100

            Test 2: Get Multiple Keys
            Expected: tile=50, lumber=80
            Actual tile: 50
            Actual lumber: 80

            Test 3: Get Non-Existent Key
            Expected: 0
            Actual: 0

            Test 4: Get Keys with Collisions
            Expected: nails=100, tile=50, lumber=80
            Actual nails: 100
            Actual tile: 50
            Actual lumber: 80

            Test 5: Get After Many Insertions
            Expected: 150 for item15
            Actual item15: 150
            Expected: 0 for missing and empty keys
            Actual missing: 0
            Actual empty: 0
        */
        
    }
    
}