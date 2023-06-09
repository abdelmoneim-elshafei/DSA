package DataStructures;

public class QueueByArray<T> {
    int size;
    int rear;
    int front;
    Object [] queue;
    public QueueByArray(int size) {
        this.size = size;
        queue = new Object[this.size];
        rear = -1;
        front = -1;
    }
   public boolean isFull(){
        return rear == size-1;
   }
   public boolean isEmpty(){
        return rear == -1 || front > rear;
   }
   public void queue(T newItem){
        if (isFull()){
            System.out.println("queue is full");
            return;
        }
        rear++;
        queue[rear] = newItem;
        if (front == -1)
            front = 0;
   }

   public T deQueue(){
        if(isEmpty()){
            System.out.println("the queue is empty");
            return null;
        }
        T item =(T) queue[front];
        front++;
       return item;
   }
   public void deleteAll(){
        front = -1;
        rear = -1;
   }

}
