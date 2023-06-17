package Algorithms.Graph;

public class BinaryTree <T extends Comparable<T>>{
    BTNode<T> root;
    static final int COUNT = 5;
    public BinaryTree(BTNode<T> root) {
        this.root = root;
    }

    public void add(BTNode newNode, BTNode rootExplore){
        if(rootExplore == null) {
            return;
        }
        if(newNode.value.compareTo(rootExplore.value) > 0){
            if(rootExplore.right == null)
                rootExplore.right = newNode;
            else
                add(newNode,rootExplore.right);
        }
        if(newNode.value.compareTo(rootExplore.value) < 0){
            if(rootExplore.left== null)
                rootExplore.left= newNode;
            else
                add(newNode,rootExplore.left);
        }

    }

    public void search(T value,BTNode explore){
        if (explore ==  null)
            return;

        if (explore.value.compareTo(value) == 0) {
            System.out.println("found value : " + explore.value);
            return;
        }

        if(value.compareTo((T) explore.value) > 0)
            search(value,explore.right);

        if(value.compareTo((T) explore.value) < 0)
            search(value,explore.left);
    }

    public BTNode deletion(T value,BTNode root){
       if(root == null)
           return root;

      if(value.compareTo((T) root.value) > 0)
          root.right = deletion(value,root.right);
      else if(value.compareTo((T) root.value) < 0)
          root.left = deletion(value,root.left);
      else {
          if (root.left == null)
              return root.right;
          if(root.right == null)
              return root.left;
            //max on left side
          root.value = maxValue(root.left);
          root.left = deletion((T) root.value, root.left);

          //min on right side
         // root.value = minValue(root.right);
         // root.right= deletion((T) root.value, root.right);
      }
      return root;
    }

    T minValue(BTNode root) {
        T minValue = (T)root.value;
        while (root.left != null) {
            minValue = (T)root.left.value;
            root = root.left;
        }
        return minValue;
    }

    T maxValue(BTNode root) {
        T minValue = (T)root.value;
        while (root.right != null) {
            minValue = (T)root.right.value;
            root = root.right;
        }
        return minValue;
    }

    public void printTree(BTNode explore, String prefix){
        if (explore == null)
            return;
        else {
            System.out.println(prefix + " - " +  explore.value);
            printTree(explore.left,prefix + " ");
            printTree(explore.right, prefix + " ");
        }
    }

    private void print2DUtil(BTNode root, int space) {
        if (root == null)
            return;

        space += COUNT;

        print2DUtil(root.right, space);

        System.out.print("\n");
        for (int i = COUNT; i < space; i++)
            System.out.print(" ");
        System.out.print(root.value + "\n");

        print2DUtil(root.left, space);
    }

    public void print2D(BTNode root) {
        print2DUtil(root, 0);
    }

    public BTNode<T> getRoot() {
        return root;
    }
}
