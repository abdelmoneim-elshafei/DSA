package Algorithms.Search;

import java.util.Optional;

public class InterpolationSearch {
    public static <T extends Number & Comparable<T>> Optional<T>
    InterpolationSearchF(T key, T[] target){
        int low = 0;
        int high = target.length - 1;
        int mid = 0;
        while(true){
            mid = low + ((high - low) / (target[high].intValue() -
                    target[low].intValue())) * (key.intValue() - target[low].intValue());
            if(target[mid].compareTo(key) == 0){
                return Optional.ofNullable(target[mid]);
            }
            if(target[mid].compareTo(key) > 0){
                high = mid - 1;
            }
            if(target[mid].compareTo(key) < 0){
                low = mid + 1;
            }if(low > high){
                return Optional.empty();
            }
        }

    }
}
