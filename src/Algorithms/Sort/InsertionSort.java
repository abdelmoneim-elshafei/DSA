package Algorithms.Sort;

public class InsertionSort {

    public static <T extends Comparable<T>> void InsertionSorting (T[] array){
        int n = array.length;
        T temp;
        int j;                     //i = 2
        for(int i = 1 ; i < n; i++){ //124 344 |84	224	895
            temp = array[i];         //temp = 84
            j = i - 1;               // j = 1
            while(j >= 0 && array[j].compareTo(temp) > 0){
                array[j + 1] = array[j]; //124 344 |344	224	895
                j = j - 1;  //j = 0
            }
            array[j+1] = temp;  // j=1 //124 |344  84	224	895
        }

    }
}
