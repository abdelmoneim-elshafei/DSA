package DataStructures;

public class CircularQueueByArray<T> {
    Object[] queue;
    int size;
    int rear;
    int front;

    public CircularQueueByArray(int size) {
        this.size = size;
        queue = new Object[size];
        rear = front = -1;
    }

    public void queue(T newItem){
        if (isFull())
            System.out.println("the queue is full");
        if(front == -1)
            front = 0;
        rear = (rear + 1) % size;
        queue[rear] = newItem;
    }
    public boolean isFull(){
        return (rear + 1) % size == front;
    }
    public T deQueue(){
        if (isEmpty()){
            System.out.println("queue is empty ");
            return null;
        }
        T item = (T) queue[front];
        front = (front + 1) % size;
        return item;
    }
    public boolean isEmpty(){
        return  front == -1;
    }

    public void display(){
        int i = front;
        while (i != rear){
            System.out.print(queue[i] + " ");
            i = (i + 1) % size;
        }
        System.out.print(queue[rear]);
        System.out.println();
    }

}
