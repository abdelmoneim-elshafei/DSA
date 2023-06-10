package Algorithms.Sort;

public class BubbleSort {
    public static <T extends Comparable<T>> void bubbleSorting(T[] array) {
        int n = array.length;
        T temp = null;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (array[j - 1].compareTo(array[j]) > 0) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    public static<T> void printArray(T[] array){
        for (T i: array) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }
}
