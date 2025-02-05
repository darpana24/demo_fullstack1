
//add element in hash map and remove element
import java.util.*;

class HashMapdemo3 {
  public static void main(String args[]) {
    HashMap<Integer, String> hm = new HashMap
    <Integer, String>();
    System.out.println("Initial list of elements: " + hm);
    hm.put(100, "Amit");
    hm.put(101, "Vijay");
    hm.put(102, "Rahul");

    System.out.println("After invoking put() method ");
    for (Map.Entry m : hm.entrySet()) {
      System.out.println(m.getKey() + " " + m.getValue());
    }

    hm.putIfAbsent(103, "Gaurav");
    hm.putIfAbsent(103, "Gaurav1");
    System.out.println("After invoking putIfAbsent() method ");
    for (Map.Entry m : hm.entrySet()) {
      System.out.println(m.getKey() + " " + m.getValue());
    }
    HashMap<Integer, String> map = new HashMap
    <Integer, String>();
    map.put(104, "Ravi");
    map.putAll(hm);
    System.out.println("After invoking putAll() method ");
    for (Map.Entry m : map.entrySet()) {
      System.out.println(m.getKey() + " " + m.getValue());
    }
    System.out.println("Initial list of elements: " + map);
    // key-based removal
    map.remove(100);
    System.out.println("Updated list of elements: " + map);
    // value-based removal
    map.remove("Vijay");
    System.out.println("Updated list of elements: " + map);
    // key-value pair based removal
    map.remove(102, "Rahul");
    System.out.println("Updated list of elements: " + map);
  }
}
