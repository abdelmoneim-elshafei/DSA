package DataStructures;

public class ArrayStructure {
    int[] array = new int[4];
    Student[] s = new Student[4];

    //2D array
    int [][] twoDArray = new int[2][2];
    public ArrayStructure(){
             array[0] = 2;
             array[1] = 3;
             array[2] = 4;
             array[3] = 5;

             //Array of Objects
        s[0] = new Student("abdelmoneim",22);
        s[1] = new Student("ahmed",17);
        s[2] = new Student("khaled",23);
        s[3] = new Student("emad",21);

        twoDArray[0][0] = 3;
        twoDArray[0][1] = 23;
        twoDArray[1][0] = 33;
        twoDArray[1][1] = 13;

    }
    public void printArry(){
        for (int i : array) {
            System.out.print(i + "\t");
        }
    }
    public void printArryOfObject(){
        for (Student student : s) {
            System.out.print("\nName : " + student.name + "\t" + "Age : " + student.age );

        }
        System.out.println();
    }
    public void print2DArry(){
        for (int[] i : twoDArray) {
           for(int j : i){
               System.out.print(j + "\t");
           }
            System.out.println();
        }
    }
}
