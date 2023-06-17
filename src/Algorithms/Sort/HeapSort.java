package Algorithms.Sort;

public class HeapSort {

    public static <T extends Comparable<T>> void heapSorting(T[] array){
        int length = array.length;

        for(int i = length/2 - 1; i>= 0 ; i--){
            heapify(array,length,i);
        }

        for (int i = length - 1 ;i >= 0 ; i--){
            swap(array,0,i);
            heapify(array,i,0);
        }

    }
    private static <T extends Comparable<T>> void heapify(T[] array, int length, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < length && array[left].compareTo(array[largest]) > 0) {
            largest = left;
        }
        if (right < length && array[right].compareTo(array[largest]) > 0) {
            largest = right;
        }
        if(largest != i){
            swap(array,largest,i);
            heapify(array,i,largest);
        }
    }

    private static <T extends Comparable<T>> void swap(T[] array, int i, int j) {
            T temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

}
