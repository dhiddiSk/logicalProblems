/*
This problem was asked by Jane Street.

    cons(a, b) constructs a pair, and car(pair) and cdr(pair) returns the first and last element of that pair.
    For example, car(cons(3, 4)) returns 3, and cdr(cons(3, 4)) returns 4.
 */
interface Choice {

    int makeChoice(int a, int b);

}


public class TaskFour {

    public  static void cons(int i, int i1){
        // So, it has to return me the pair function.

        System.out.println(car(i,i1, (a,b) -> a));
        System.out.println(cdr(i,i1, (a, b) -> b));



    }

    // here we are storing the function in variable 'var', which is achieved by using the lambda.
    private static int car(int a, int b, Choice var){
          return var.makeChoice(a, b);
    }

    private static int cdr(int a, int b, Choice var) {
        return var.makeChoice(a, b);
    }

    public static void main(String[] args) {
        cons(3,4);

    }

}
