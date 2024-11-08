package Basic;

import java.util.SortedSet;
import java.util.TreeSet;

public class Example_one {
    public static void main(String[] args) {
        // Create a SortedSet using TreeSet
        SortedSet<String> names = new TreeSet<>();

        // Add elements to the TreeSet
        names.add("Charlie");
        names.add("Alice");
        names.add("Eve");
        names.add("Bob");

        // Display the sorted elements
        System.out.println("Sorted names: " + names);

        // Check if a specific name is in the set
        if (names.contains("Alice")) {
            System.out.println("Alice is in the list.");
        }

        // Remove an element
        names.remove("Eve");
        System.out.println("After removal: " + names);

        // Print elements using a for-each loop
        System.out.println("Names in sorted order:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
