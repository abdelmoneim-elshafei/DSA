import DataStructures.ArrayStructure;
import DataStructures.DynamicArray;
import DataStructures.LinkedList;
import DataStructures.Node;

public class Main {
    public static void main(String[] args) {
      //  ArrayStructure a = new ArrayStructure();
      //  a.printArry();
      //  a.printArryOfObject();
      //  a.print2DArry();

      //  DynamicArray<Integer> dynamicArray = new DynamicArray<>();
      //  dynamicArray.put(20);
      //  System.out.println(dynamicArray.getSize());
      //  dynamicArray.put(29);
      //  System.out.println(dynamicArray.getSize());
      //  dynamicArray.put(33);
      //  System.out.println(dynamicArray.getSize());
      //  dynamicArray.put(44);
      //  System.out.println(dynamicArray.getSize());
      //  dynamicArray.put(14);
      //  System.out.println(dynamicArray.getSize());

      //  DynamicArray<String> dynamicArrayString = new DynamicArray<>();
      //  dynamicArrayString.put("coojl");
      //  System.out.println(dynamicArrayString.getSize());
      //  System.out.println(dynamicArrayString.get(0));


        LinkedList<Integer> list = new LinkedList<>(new Node<Integer>(20, null));
        list.add(new Node<Integer>(32,null));
        list.add(new Node<Integer>(22,null));
        list.add(new Node<Integer>(12,null));
        list.add(new Node<Integer>(62,null));
        list.display();
        list.delete();
        list.display();
        list.delete();
        list.display();

        LinkedList<Character> charlist = new LinkedList<>(new Node<Character>('a', null));
        charlist.add(new Node<Character>('b',null));
        charlist.add(new Node<Character>('c',null));
        charlist.add(new Node<Character>('d',null));
        charlist.add(new Node<Character>('g',null));
        charlist.display();
        charlist.delete();
        charlist.display();
        charlist.delete();
        charlist.display();
    }
}