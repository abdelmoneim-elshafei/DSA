package DataStructures;

public class Entry <T>{
    int key;
    T value;
    Entry<T> next;
    public Entry(int key, T value) {
        this.key = key;
        this.value = value;
        next = null;
    }

    public Entry() {
        next =null;;
    }

    public int getKey() {
        return key;
    }

    public T getValue() {
        return value;
    }
}
