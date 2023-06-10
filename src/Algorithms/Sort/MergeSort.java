package Algorithms.Sort;

import java.util.Arrays;

public class MergeSort {

    public static <T extends Comparable<T>> void mergeSorting(T[] array){
        int l= array.length;
        if(l < 2)
            return;

        int mid = l/2;
        T[] left = Arrays.copyOfRange(array, 0, mid);
        T[] right = Arrays.copyOfRange(array, mid, array.length);
       // T[] left = (T [])new Comparable[mid];
       // T[] right = (T [])new Comparable[l - mid];
       // for(int i = 0; i < mid ;i++){
       //     left[i] = array[i];
       // }
       // for(int i = mid; i < l ; i++){
       //     right[i - mid] = array[i];
       // }
        mergeSorting(left);
        mergeSorting(right);
        merge(array,left,right);
    }

    private static <T extends Comparable<T>> void merge(T[] array, T[] left, T[] right){
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length){
          if(left[i].compareTo(right[j]) <= 0 ){
             array[k] = left[i];
             i++;
          }else {
              array[k] = right[j];
              j++;
          }
          k++;
        }
        while (i < left.length){
            array[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length){
            array[k] = right[j];
            j++;
            k++;
        }
    }
}
