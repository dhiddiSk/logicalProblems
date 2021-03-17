import java.util.ArrayList;
import java.util.List;

/*

Good morning! Here's your coding interview problem for today.

This problem was asked by Twitter.

You run an e-commerce website and want to record the last N order ids in a log. Implement a data structure to accomplish this, with the following API:

record(order_id): adds the order_id to the log
get_last(i): gets the ith last element from the log. i is guaranteed to be smaller than or equal to N.
You should be as efficient with time and space as possible.

*/
public class TaskEight {

   private int N_Orders;
   private ArrayList<Integer> Ids = new ArrayList<Integer>();

    public TaskEight(int N_Orders) {

        this.N_Orders = N_Orders;
    }

    public void record(int orderIds){

        //Adding the orderIds into ArrayList data structure.
        Ids.add(orderIds);

    }

    public List<Integer> get_last(int i){

        int sizeOfOrders = Ids.size();

        // Return the last elements of the arraylist. math.max function is used to avoid failure where the size of order is less than i.

       return Ids.subList(Math.max(sizeOfOrders-i,i), sizeOfOrders);
    }

}
