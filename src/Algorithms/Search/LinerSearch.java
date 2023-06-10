package Algorithms.Search;

import java.util.Optional;

public class LinerSearch {
    public static <T> Optional<T> LinerSearchFunction(T key, T[] target){
        for (T i : target){
            if(i.equals(key)){
                return Optional.ofNullable(i);
            }
        }
        System.out.println("Not Found");
        return Optional.empty();
    }
}
