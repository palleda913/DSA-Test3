public class Queue {
    private Node front;
    private Node rear;

    
    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    
    public Queue() {
        front = null;
        rear = null;
    }

   
    public boolean isEmpty() {
        return (front == null);
    }

   
    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println(value + " enqueued to the queue.");
    }

    
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue element.");
            return -1; 
        }
        int value = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        System.out.println(value + " dequeued from the queue.");
        return value;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        System.out.println("Is queue empty? " + queue.isEmpty());

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Dequeued element: " + queue.dequeue());

        queue.enqueue(40);
        queue.enqueue(50);

        System.out.println("Is queue empty? " + queue.isEmpty());

        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Dequeued element: " + queue.dequeue()); 

        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}