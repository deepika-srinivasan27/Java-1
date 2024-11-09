package Basic;

class Queue {
    private int front, rear, maxSize;
    private int[] queueArray;

    // Constructor to initialize the queue
    public Queue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
    }

    // Method to add an element to the queue
    public void enqueue(int value) {
        if (rear == maxSize - 1) {
            System.out.println("Queue overflow! Unable to enqueue " + value);
        } else {
            queueArray[++rear] = value;
            System.out.println("Enqueued " + value + " to the queue.");
        }
    }

    // Method to remove an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue underflow! Unable to dequeue.");
            return -1;
        } else {
            int dequeuedValue = queueArray[front];
            for (int i = 0; i < rear; i++) {
                queueArray[i] = queueArray[i + 1];
            }
            rear--;
            return dequeuedValue;
        }
    }

    // Method to view the front element of the queue without removing it
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
        return (rear < front);
    }

    // Main method to test the queue
    public static void main(String[] args) {
        Queue queue = new Queue(5); // Creating a queue with maximum size 5

        // Enqueuing elements into the queue
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        // Displaying the front element
        System.out.println("Front element is: " + queue.peek());

        // Dequeuing elements from the queue
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Dequeued element: " + queue.dequeue());

        // Checking if the queue is empty
        System.out.println("Is the queue empty? " + queue.isEmpty());

        // Trying to dequeue from an empty queue
        System.out.println("Dequeued element: " + queue.dequeue());
    }
}
