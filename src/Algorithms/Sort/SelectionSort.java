package Algorithms.Sort;

public class SelectionSort {
    public static <T extends Comparable<T>> void SelectionSorting(T[] array){
        int n = array.length;
        int minIndex ;
        T temp;
        for(int i = 0; i < n ; i++){
           minIndex = i;
           for(int j = i + 1; j < n; j++){
               if(array[minIndex].compareTo(array[j]) > 0){
                  minIndex = j;
               }
           }
           if (minIndex != i) {
               temp = array[minIndex];
               array[minIndex] = array[i];
               array[i] = temp;
           }
        }
    }
}
