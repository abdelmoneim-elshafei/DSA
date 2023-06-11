package Algorithms.Sort;

import java.util.Arrays;

public class MergeSort<T extends Comparable<T>> {

    T[] array;
    T[] temp;


    public MergeSort(T[] array) {
        this.array = array;
        temp = (T[]) new Comparable[array.length];
        mergeSortingByIndex(0,array.length - 1);
    }

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


    private <T extends Comparable<T>> void mergeSortingByIndex(int low,int high){
        if(low < high) {
            int mid = low + (high - low) / 2;
            mergeSortingByIndex(low, mid);
            mergeSortingByIndex(mid + 1, high);
            merge(low, mid, high);
        }
    }
    private <T extends Comparable<T>> void merge(int low , int mid , int high){
        for(int i = low ; i<= high ; i++)
            temp[i] = array[i];

        int i = low, j = mid + 1, k = low;
        while (i <= mid && j <= high){
            if(temp[i].compareTo(temp[j]) <= 0 ){
                array[k] = temp[i];
                i++;
            }else {
                array[k] = temp[j];
                j++;
            }
            k++;
        }
        while (i <= mid){
            array[k] = temp[i];
            i++;
            k++;
        }
        /*while (j < high){
            array[k] = temp[j];
            j++;
            k++;
        }*/
    }
}
