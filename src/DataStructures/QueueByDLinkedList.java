package DataStructures;

public class QueueByDLinkedList<T>{
    DoubleNode<T> rear;
    DoubleNode<T> front;

    public QueueByDLinkedList(DoubleNode<T> newNode) {
        this.front = this.rear = newNode;
    }

    public void queue(DoubleNode<T> newNode){
        if (isEmpty()){
            front = rear = newNode;
        }
        rear.next = newNode;
        newNode.next = null;
        newNode.previous = rear;
        rear = newNode;
    }

    public T deQueue(){
        if (isEmpty()){
            System.out.println("the queue is empty");
            return null;
        }
        T item = front.value;
        front = front.next;
        return item;
    }
    public void display(){
        DoubleNode<T> n = front;
        while (n != null){
            System.out.print(n.value + " ");
            n = n.next;
        }
        System.out.println();
    }
    public boolean isEmpty(){
        return front == null;
    }
}
