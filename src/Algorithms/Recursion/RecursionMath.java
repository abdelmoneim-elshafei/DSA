package Algorithms.Recursion;

public class RecursionMath {

    public static int factorial(int number){
        if(number == 1 || number == 0)
            return 1;
       return number * factorial(--number);
    }

    public static int fibonacci(int number){
        if(number == 0) {
            return 0;
        }
        if(number == 1) {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }

    public static void towerOfHanoi(int n, String source, String target, String auxiliary) {
        if (n > 0) {
            towerOfHanoi(n - 1, source, auxiliary, target);
            System.out.println("Move disk " + n + " from " + source + " to " + target);
            towerOfHanoi(n - 1, auxiliary, target, source);
        }
    }

    /*
        A(m, n) = n + 1                      if m = 0
        A(m, n) = A(m - 1, 1)                if m > 0 and n = 0
        A(m, n) = A(m - 1, A(m, n - 1))      if m > 0 and n > 0

     */
    public static int ackermann(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return ackermann(m - 1, 1);
        } else {
            return ackermann(m - 1, ackermann(m, n - 1));
        }
    }
}
