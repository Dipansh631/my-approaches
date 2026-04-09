package Stacks;

class queuelearn {
    static class Node {
        int data;
        Node next;
        Node(int val) {
            this.data = val;
            this.next = null;
        }
    }

    Node front = null;
    Node rear = null;

    public void enqueue(int var) {
        Node newnode = new Node(var);

        if (front == null) {
            front = rear = newnode;
            return;
        }

        rear.next = newnode;
        rear = newnode;
    }

    public void dequeue() {
        if (front == null) {
            System.out.println("queue is empty");
            return;
        }

        front = front.next;

        if (front == null) {
            rear = null;
        }
    }

    public int peek() {
        if (front == null) {
            System.out.println("queue is empty");
            return -1;
        }
        return front.data;
    }

    public void display() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        queuelearn s = new queuelearn();

        s.enqueue(10);
        s.enqueue(20);
        s.enqueue(30);
        s.enqueue(40);

        System.out.print("Queue: ");
        s.display();

        s.dequeue();
        System.out.print("After dequeue: ");
        s.display();

        System.out.println("Peek: " + s.peek());
    }
}
