
import java.util.*;

class ProrityQueuedemo {
    public static void main(String args[]) {
        PriorityQueue que = new PriorityQueue<String>();
        // Deque que = new LinkedList<String>();
        que.add("Apple");
        que.add("Orange");
        que.add("Banana");
        que.add("Grapes");
        que.add("Mango");
        que.add("Custerd Apple");
        System.out.println("All ele of queue");
        Iterator obj1 = que.iterator();
        while (obj1.hasNext()) {
            String str = (String) obj1.next();
            System.out.println(str);
        }
        System.out.println("Removed ele=" + que.remove());

        System.out.println("All ele of queue");
        obj1 = que.iterator();
        while (obj1.hasNext()) {
            String str = (String) obj1.next();
            System.out.println(str);
        }
    }
}