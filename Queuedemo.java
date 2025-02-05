
import java.util.*;

class Queuedemo {
  public static void main(String args[]) {
    // PriorityQueue que = new PriorityQueue();
    Queue que = new LinkedList<String>();

    que.add("Orange");
    que.add("Banana");
    que.add("Grapes");
    que.add("Mango");
    que.add("Apple");
    que.add("Custerd Apple");
    System.out.println("Ele of queue");
    Iterator it = que.iterator();
    while (it.hasNext()) {
      System.out.println("str=" + it.next());
    }

    System.out.println("Removed ele=" + que.remove());
    System.out.println("Ele of queue");
    it = que.iterator();
    while (it.hasNext()) {
      System.out.println("str=" + it.next());
    }
    System.out.println("Peeked ele=" + que.peek());
  }
}
