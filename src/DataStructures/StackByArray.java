package DataStructures;

public class StackByArray <T>{
    int size;
    Object [] stack;
    int top;
    public StackByArray(int size) {
        this.size = size;
        stack = new Object[this.size];
        top = -1;
    }

    public void push(T newItem){
       if (isFull()){
           System.out.println("Stack is Full");
           return;
       }
       top++;
       stack[top] = newItem;
    }
    public boolean isFull(){
        return top == size - 1;
    }

    public T pop() {
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return null;
        }
        T item = (T) stack[top];
        top--;
        return item;
    }
    public boolean isEmpty(){
        return top == -1;
    }

}
