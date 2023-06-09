package DataStructures;

import java.util.Arrays;

public class StackByDynamicArray<T> {
    int size;
    Object[] stack;
    int top;

    public StackByDynamicArray() {
        size = 1;
        stack = new Object[size];
        top = -1;
    }

    public void push(T newItem) {
        checkCapacity(top + 2);
        top++;
        stack[top] = newItem;
        size++;
    }

    public void checkCapacity(int min) {
        int old = stack.length;
        if (old < min) {
            int newCapacity = old * 2;
            stack = Arrays.copyOf(stack, newCapacity);
        }
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("stack is empty");
            return null;
        }
        T item = (T) stack[top];
        top--;
        size--;
        resize(size);
        return item;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int length() {
        return stack.length;
    }

    public int size() {
        return size;
    }

    public void resize(int size) {
        int old = stack.length;
        if (size < old / 2) {
            int newSize = old / 2;
            stack = Arrays.copyOf(stack, newSize);
        }
    }

}
