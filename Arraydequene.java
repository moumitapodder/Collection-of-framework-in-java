import java.util.ArrayDeque;
public class Arraydequene {
    public static void main(String [] args){

    ArrayDeque<Integer>pQueue=new ArrayDeque<>();
    pQueue.offer(10);

    pQueue.offer(-1);
    pQueue.offer(20);
    pQueue.offer(-5);
    pQueue.offer(-10);
    pQueue.offer(-20);       
  System.out.println(pQueue);

    // Printing the top element of PriorityQueue peek() have same functionality as peekFirst();
    System.out.println(pQueue.peek());
    System.out.println(pQueue.peekFirst());
    //it will pick the element from the last;
    System.out.println(pQueue.peekLast());

    // Printing the top element and removing it
    // from the PriorityQueue container
    System.out.println(pQueue.poll());
    //pollFirst() has same functionality as poll();
    System.out.println(pQueue.pollFirst());
    //pollLast will delete the element from the last;
    System.out.println(pQueue.pollLast());
    // Printing the top element again
    System.out.println(pQueue.peek());
}
}
