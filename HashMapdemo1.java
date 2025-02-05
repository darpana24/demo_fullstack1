
//Store values in hashmap and retrive them
import java.util.*;

public class HashMapdemo1 {
   public static void main(String args[]) {
      HashMap<Integer, String> map = new HashMap<Integer, String>();
      map.put(1, "Mango");
      map.put(2, "Apple");

      map.put(4, "Grapes");
      map.put(3, "Banana");
      map.put(4, "Lichi");
      map.put(5, "Lichi");

      System.out.println("Iterating Hashmap...");
      for (Map.Entry m : map.entrySet()) {
         System.out.println(m.getKey() + " " + m.getValue());
      }
   }
}