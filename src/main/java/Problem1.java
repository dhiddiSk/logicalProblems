package Interview_samples; /*

 level: easy
 This problem was recently asked by Google.

 Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17**/
// try: // first arrange array in ascending order then check(add) from ends of both sides of array i.e minimum and
// maximum value
       // , if the value is equal to k its ok, if it asks for second highest number then go to other pairs.
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
class solver1 extends IndexOutOfBoundsException {
    int[] list_copy;
    int size;
    double n;

    public solver1(int[] my_list, double k) {
        list_copy = my_list;
        n = k;
        size = list_copy.length;
    }

    public boolean sorter()   {
        Arrays.sort(list_copy);
        System.out.print(Arrays.toString(list_copy));
        for (int i = 1; i<= (int)(size/2); i++){

            if (n == (list_copy[i-1] + list_copy[size - i])) {
                return true;
            }
        }
        return false;
    }
}

public class Problem1 {
    public static void main(String[] args) throws IOException {
        int[] my_list = {10,15,3,7};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of k");
                 try{
                     double k = sc.nextInt();
                     solver1 obj1 = new solver1(my_list,k);
                       boolean x = obj1.sorter();
                       System.out.println(x);

                 }
               catch(ArrayIndexOutOfBoundsException e) {
                   e.getStackTrace();
                     System.out.println(e);
        }

    }

}
