package Algorithms.Graph;

public class BTNode <T extends Comparable<T>>{
    T value;
    BTNode left;
    BTNode right;

    public BTNode(T value, BTNode left, BTNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
