import java.util.ArrayList;
import java.util.PriorityQueue;
 public class s {
    
    // Main Method
  public static void main(String args[])
  {
      // Creating empty priority queue
      PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

      // Adding items to the pQueue using add() or offer()//
      pQueue.offer(10);

      pQueue.offer(-1);
      pQueue.offer(20);
      pQueue.offer(-5);
      pQueue.offer(-10);
      pQueue.offer(-20);       
    System.out.println(pQueue);//printing in the format of min-heap

      // Printing the top element of PriorityQueue
      System.out.println(pQueue.peek());

      // Printing the top element and removing it
      // from the PriorityQueue container
      System.out.println(pQueue.poll());

      // Printing the top element again
      System.out.println(pQueue.peek());
  }
}


    
 