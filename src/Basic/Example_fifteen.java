package Basic;

public class Example_fifteen {
    public static void main(String[] args) {
        // Define an array of integers
        int[] numbers = {34, 7, 23, 32, 5, 62};

        // Assume the first element is the largest initially
        int max = numbers[0];

        // Loop through the array to find the largest element
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Print the largest element
        System.out.println("The largest element in the array is: " + max);
    }
}
