package Basic;

class CircularQueue {
    private int[] queueArray;
    private int front, rear, maxSize, currentSize;

    // Constructor to initialize the circular queue
    public CircularQueue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        currentSize = 0;
    }

    // Method to add an element to the circular queue
    public void enqueue(int value) {
        if (currentSize == maxSize) {
            System.out.println("Queue overflow! Unable to enqueue " + value);
        } else {
            rear = (rear + 1) % maxSize; // Move rear in a circular manner
            queueArray[rear] = value;
            currentSize++;
            System.out.println("Enqueued " + value + " to the circular queue.");
        }
    }

    // Method to remove an element from the circular queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue underflow! Unable to dequeue.");
            return -1;
        } else {
            int dequeuedValue = queueArray[front];
            front = (front + 1) % maxSize; // Move front in a circular manner
            currentSize--;
            return dequeuedValue;
        }
    }

    // Method to view the front element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        } else {
            return queueArray[front];
        }
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return (currentSize == 0);
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return (currentSize == maxSize);
    }

    // Main method to test the circular queue
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5); // Circular queue with maximum size 5

        // Enqueuing elements
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        // Attempting to enqueue in a full queue
        queue.enqueue(60);

        // Displaying the front element
        System.out.println("Front element is: " + queue.peek());

        // Dequeuing elements
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Dequeued element: " + queue.dequeue());

        // Enqueuing elements again
        queue.enqueue(60);
        queue.enqueue(70);

        // Displaying the front element after dequeuing and enqueuing
        System.out.println("Front element after operations: " + queue.peek());
    }
}
