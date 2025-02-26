package Task22Feb25.Queue;
import java.util.PriorityQueue;
public class lab_01_Queue {
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue();
        q.add("Nagraj");
        q.add("Bitla");
        System.out.println(q);
        // Queue -> First in First Out
        //offer - add
        //peek - see the first element (fifo element) which want to remove
        //poll - delete
        System.out.println(q);
        System.out.println(q.peek());//Retrives the head of the Queue
        System.out.println(q);
        System.out.println(q.poll());//Retrives but do not remove the hear of the Queue
        System.out.println(q);
    }
}
