package Basic;

class Queu {
    private int maxSize;       // size of the queue
    private int front;         // front element index
    private int rear;          // rear element index
    private int[] queueArray;
    private int currentSize;   // number of elements in the queue

    // Constructor to initialize the queue
    public Queu(int size) {
        this.maxSize = size;
        this.queueArray = new int[maxSize];
        this.front = 0;
        this.rear = -1;
        this.currentSize = 0;
    }

    // Method to add an element to the queue
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + value);
        } else {
            rear = (rear + 1) % maxSize;  // wrap-around
            queueArray[rear] = value;
            currentSize++;
            System.out.println("Enqueued " + value + " to the queue");
        }
    }

    // Method to remove an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        } else {
            int value = queueArray[front];
            front = (front + 1) % maxSize;  // wrap-around
            currentSize--;
            System.out.println("Dequeued " + value + " from the queue");
            return value;
        }
    }

    // Method to peek at the front element without removing it
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
}

public class Example_nine {
    public static void main(String[] args) {
        Queue queue = new Queue(5); // Queue of size 5

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front element is: " + queue.peek());

        queue.dequeue();
        queue.dequeue();

        System.out.println("Is queue empty? " + queue.isEmpty());

        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(70); // Queue should be full here
    }
}
