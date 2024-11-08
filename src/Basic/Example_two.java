package Basic;

import java.util.LinkedList;

public class Example_two {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> cities = new LinkedList<>();

        // Add elements to the LinkedList
        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");
        cities.add("Houston");

        // Display the LinkedList
        System.out.println("Cities: " + cities);

        // Add an element at the beginning and end
        cities.addFirst("San Francisco");
        cities.addLast("Miami");
        System.out.println("After additions: " + cities);

        // Access and display elements
        System.out.println("First city: " + cities.getFirst());
        System.out.println("Last city: " + cities.getLast());

        // Remove an element
        cities.remove("Chicago");
        System.out.println("After removal: " + cities);

        // Iterate through the LinkedList
        System.out.println("Cities in the list:");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}

