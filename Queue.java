package Highway;

public class Queue {
    int nodeCount = 0; //number of nodes/ number of cars in queue

    //Node class will contain cars and a next pointer
    public class Node {
        Car car;
        Node next;

        //Node constructor
        public Node(Car car) {
            this.car = car;
            this.next = null;

        }
    }

    //the head and tail of the queue
    private Node head;
    private Node tail;

    //sets head and tail to null
    public Queue() {
        this.head = null;
        this.tail = null;
    }

    //this will add cars to the queue
    public void enqueue (Car car){

        Node node = new Node(car);

        if (head == null){
            head = node;
        }
        else {
            tail.next = node;
        }
        tail = node;
        nodeCount++;

    }

    //this will remove cars from the queue
    public Car dequeue (){
        if (head == null){
            System.out.println("Queue is empty");
            return null;
        }
        Car dequedCar = head.car;
        head = head.next;
        if (head == null){
            tail = null; //if there is no head, there should be nothing
        }
        nodeCount--;
        return dequedCar;
    }

    //prints the contents of the queue. Used as a visual test
    public void printQueue(){
        if (head == null){
            System.out.println("Queue is empty");
        }
        System.out.print("Queue: ");
        Node current = head;
        while (current != null){
            System.out.println(current.car);
            current = current.next;

        }

    }
    //getters for head and tail, used for unit test
    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }
}
