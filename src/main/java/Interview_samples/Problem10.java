package Interview_samples;/*     Good morning! Here's your coding interview problem for today.

        This problem was asked by Apple.

        Implement a job scheduler which takes in a function f and an integer n, and calls f after n milliseconds.*/
import java.util.*;
class jobScheduler{
          int t;
         jobScheduler(int t){
         this.t =t;
         }
    public void func(){
             System.out.println("function called by the scheduler at t "+t);
    }


}
public class Problem10 {
    public static void main(String args[])throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        System.out.println("calling the function in given time lapse between the functions");

          int n = sc.nextInt();
        jobScheduler js = new jobScheduler(1);
             js.func();
        Thread.sleep(n*100);
             jobScheduler js2 = new jobScheduler(2);
        js2.func();

    }

}
