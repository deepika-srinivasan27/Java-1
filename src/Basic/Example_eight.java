package Basic;

class Sta {
    private int maxSize;     // size of stack
    private int top;         // index for the top element
    private int[] stackArray;

    // Constructor to initialize the stack
    public Sta(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;       // initially stack is empty
    }

    // Method to add an element to the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            stackArray[++top] = value;
            System.out.println("Pushed " + value + " onto the stack");
        }
    }

    // Method to remove an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        } else {
            int value = stackArray[top--];
            System.out.println("Popped " + value + " from the stack");
            return value;
        }
    }

    // Method to peek the top element of the stack without removing it
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

    // Method to check if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }
}

public class Example_eight {
    public static void main(String[] args) {
        Stack stack = new Stack(5); // Stack of size 5

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is: " + stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}

