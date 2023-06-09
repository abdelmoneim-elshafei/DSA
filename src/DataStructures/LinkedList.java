package DataStructures;

public class LinkedList<T> {
    Node<T> head;
    public LinkedList(Node<T> head) {
        this.head = head;
    }

    public void add(Node<T> newNode){
        newNode.next = head;
        head = newNode;
    }
    public void delete(){
        head = head.next;
    }
    public void display(){
        Node<T> node = head;
        while (node != null){
            System.out.print(node.value);
            if(node.next != null)
                System.out.print(" --> ");
            node = node.next;
        }
        System.out.println();
    }

}
