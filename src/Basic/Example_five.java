package Basic;

class Stack {
    private int maxSize;     // Maximum size of the stack
    private int top;         // Index of the top element
    private int[] stackArray; // Array to hold stack elements

    // Constructor to initialize the stack
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // Indicates the stack is initially empty
    }

    // Method to add an element to the stack
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack overflow! Unable to push " + value);
        } else {
            stackArray[++top] = value;
            System.out.println("Pushed " + value + " into the stack.");
        }
    }

    // Method to remove an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow! Unable to pop.");
            return -1;
        } else {
            return stackArray[top--];
        }
    }

    // Method to view the top element of the stack without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Main method to test the stack
    public static void main(String[] args) {
        Stack stack = new Stack(5); // Creating a stack with maximum size 5

        // Pushing elements into the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Displaying the top element
        System.out.println("Top element is: " + stack.peek());

        // Popping elements from the stack
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        // Checking if the stack is empty
        System.out.println("Is the stack empty? " + stack.isEmpty());

        // Trying to pop from an empty stack
        System.out.println("Popped element: " + stack.pop());
    }
}

