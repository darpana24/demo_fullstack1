import java.util.*;

class LinkedHashMap1 {
   public static void main(String args[]) {
      LinkedHashMap<Integer, String> map = 
      new LinkedHashMap<Integer, String>();
      map.put(100, "Amit");
      map.put(101, "Vijay");
      map.put(102, "Rahul");
      // Fetching key
      System.out.println("Keys: " + map.keySet());
      // Fetching value
      System.out.println("Values: " + map.values());
      // Fetching key-value pair
      System.out.println("Key-Value pairs: " +map.entrySet());
      map.remove(102);
      System.out.println("After invoking remove()method: ");
      for (Map.Entry m : map.entrySet()) {
         System.out.println(m.getKey() + " " + m.getValue());
      }
   }
}