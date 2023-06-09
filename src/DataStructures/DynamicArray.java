package DataStructures;
import java.util.Arrays;

public class DynamicArray<T> {
   Object[] data;
   int size;

   public DynamicArray(){
       size = 1;
       data = new Object[size];
   }

   public T get(int index){
       return (T) data[index];
   }

   public void put(T element){
       checkCapacity(size + 1);
       data[size++] = element;

   }
   public int getSize(){
       return data.length;
   }

   void checkCapacity(int minCapacity){
       int oldCapacity = data.length;
       if(oldCapacity < minCapacity){
          int newCapacity = oldCapacity * 2;
          if(newCapacity < minCapacity)
              newCapacity = minCapacity;
         data = Arrays.copyOf(data, newCapacity);
       }
   }

}
