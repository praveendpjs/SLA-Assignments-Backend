class ArrayQueue {
    int capacity;
    int[] queue;
    int front;
    int rear;

    ArrayQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
    }

    public boolean isEmpty() {
        return front > rear;
    }

    public boolean isFull() {
        return rear == capacity - 1;
    }

    public void Enque(int data) {
        if (isFull()) {
            System.out.println("The queue is full");
        }
        queue[++rear] = data;
        System.out.println(data + " inserted");
    }

    public int Deque() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
            return -1;
        }
        return queue[front++];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return queue[front];
    }

    public void display() {
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}

public class Task2 {
    public static void main(String[] args) {
        ArrayQueue arr = new ArrayQueue(5);
        arr.Enque(10);
        arr.Enque(20);
        arr.Enque(30);
        arr.Enque(40);
        arr.Enque(50);
        arr.display();

        arr.Deque();
        arr.display();

        System.out.println("Front: " + arr.peek());

    }
}
