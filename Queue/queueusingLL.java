
class Node {
    int x;
    Node next;

    // constructor to create a new linked list node
    public Node(int x) {
        this.x = x;
        this.next = null;
    }
}

class Queue {
    Node front, rear;

    public Queue() {
        front = rear = null;
    }

    void enqueue(int x) {
        Node newNode = new Node(x);

        if (rear == null) {
            front = rear = newNode;
        }
        rear.next = newNode;
        rear = newNode;
    }

    void dequeue() {
        if (front == null)
            return;
        Node newNode = front;
        front = front.next;
    }

}

class queueusingLL {

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

    }

}
