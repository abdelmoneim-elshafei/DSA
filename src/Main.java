import Algorithms.Search.LinerSearch;
import DataStructures.*;

import java.util.Optional;

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

      //  LinkedList<Integer> list = new LinkedList<>(new Node<Integer>(20, null));
      //  list.add(new Node<Integer>(32,null));
      //  list.add(new Node<Integer>(22,null));
      //  list.add(new Node<Integer>(12,null));
      //  list.add(new Node<Integer>(62,null));
      //  list.display();
      //  list.delete();
      //  list.display();
      //  list.delete();
      //  list.display();

      //  LinkedList<Character> charlist = new LinkedList<>(new Node<Character>('a', null));
      //  charlist.add(new Node<Character>('b',null));
      //  charlist.add(new Node<Character>('c',null));
      //  charlist.add(new Node<Character>('d',null));
      //  charlist.add(new Node<Character>('g',null));
      //  charlist.display();
      //  charlist.delete();
      //  charlist.display();
      //  charlist.delete();
      //  charlist.display();


        // Stack
       // StackByArray<Integer> stack = new StackByArray<>(5);
       // stack.push(20);
       // stack.push(23);
       // stack.push(25);
       // stack.push(21);
       // stack.push(28);
       // while (!stack.isEmpty()){
       //     System.out.println(stack.pop());
       // }
       // System.out.println("-----------------------");
       // stack.push(45);
       // stack.push(11);
       // stack.push(68);
       // while (!stack.isEmpty()){
       //     System.out.println(stack.pop());
       // }


        //Stack
      // System.out.println("-----------------------");

      // StackByDynamicArray<Integer> dynamicStack = new StackByDynamicArray<>();
      // dynamicStack.push(20);
      // dynamicStack.push(40);
      // dynamicStack.push(41);
      // dynamicStack.push(43);
      // dynamicStack.push(48);
      //  while (!dynamicStack.isEmpty()){
      //      System.out.println(dynamicStack.pop());
      //  }
      //  System.out.println(dynamicStack.size());
      //  System.out.println(dynamicStack.length());
      //  dynamicStack.push(20);
      //  dynamicStack.push(40);
      //  dynamicStack.push(41);
      //  dynamicStack.push(43);
      //  dynamicStack.push(48);
      //  System.out.println(dynamicStack.size());
      //  System.out.println(dynamicStack.length());

        //Normal Queue
      //  QueueByArray<Integer> queue = new QueueByArray<>(7);
      //  queue.queue(20);
      //  queue.queue(30);
      //  queue.queue(34);
      //  queue.queue(90);
      //  queue.queue(48);
      //  queue.queue(74);
      //  queue.queue(18);
      //  while (!queue.isEmpty()){
      //      System.out.println(queue.deQueue());
      //  }
      //  queue.deleteAll();
      //  queue.queue(89);
      //  System.out.println("---------------------");
      //  while (!queue.isEmpty()){
      //      System.out.println(queue.deQueue());
      //  }


        //Circular Queue
       // CircularQueueByArray<Integer> cqba  = new CircularQueueByArray<>(5);
       // cqba.queue(10);
       // cqba.queue(34);
       // cqba.queue(48);
       // cqba.queue(98);
       // cqba.queue(91);
       // cqba.display();
       // cqba.deQueue();
       // cqba.deQueue();
       // cqba.queue(11);
       // cqba.queue(84);
       // cqba.display();

     //   QueueByDLinkedList<Integer> queue = new QueueByDLinkedList<>(
     //           new DoubleNode<Integer>(12,null,null));
     //   queue.queue(new DoubleNode<Integer>(32,null,null));
     //   queue.queue(new DoubleNode<Integer>(43,null,null));
     //   queue.queue(new DoubleNode<Integer>(13,null,null));
     //   queue.queue(new DoubleNode<Integer>(34,null,null));
     //   queue.display();
     //   queue.deQueue();
     //   queue.deQueue();
     //   queue.deQueue();
     //   queue.deQueue();
     //   queue.deQueue();
     //   queue.queue(new DoubleNode<Integer>(34,null,null));
     //   queue.queue(new DoubleNode<Integer>(32,null,null));
     //   queue.display();

     //   HashTableByArrayOfLinkedList<String> hash = new HashTableByArrayOfLinkedList<>(5);
     //   hash.put(10,"abdelmoneim");
     //   hash.put(15,"ahmed");
     //   hash.put(5,"pose");
     //   hash.put(12,"amire");
     //   hash.put(13,"emad");
     //   System.out.println(hash.get(5));


        Integer [] a = new Integer[5];
        a[0] = 344;
        a[1] = 124;
        a[2] = 84;
        a[3] = 224;
        a[4] = 895;
        Integer key = 344;
        Optional<Integer> result = LinerSearch.LinerSearchFunction(key,a);
        result.ifPresent(System.out::println);

        String [] strings = new String[5];
        strings[0] = "ahmed";
        strings[1] = "abdelmoneim";
        strings[2] = "adel";
        strings[3] = "mohamed";
        strings[4] = "khaled";

        String skey = "adael";
        Optional<String> sresult = LinerSearch.LinerSearchFunction(skey,strings);
        sresult.ifPresent(System.out::println);
    }
}