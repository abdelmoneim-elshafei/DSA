package DataStructures;

public class DoubleNode<T> {
    T value;
    DoubleNode<T> next;
    DoubleNode<T> previous;

    public DoubleNode(T value, DoubleNode<T> next, DoubleNode<T> previous) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }
}
