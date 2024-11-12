package Basic;

class Que {
    private int front, rear, maxSize;
    private int[] queueArray;

    // Constructor to initialize the queue
    public Que(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
    }

    // Enqueue an element to the queue
    public void enqueue(int value) {
        if (rear == maxSize - 1) {
            System.out.println("Queue is full. Cannot enqueue " + value);
        } else {
            queueArray[++rear] = value;
            System.out.println("Enqueued " + value + " to the queue.");
        }
    }

    // Dequeue an element from the queue
    public int dequeue() {
        if (front > rear) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        } else {
            return queueArray[front++];
        }
    }

    // Peek at the front element of the queue
    public int peek() {
        if (front > rear) {
            System.out.println("Queue is empty.");
            return -1;
        } else {
            return queueArray[front];
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front element: " + queue.peek());

        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Dequeued element: " + queue.dequeue());
    }
}

