import java.util.*;

public class Vectordemo {
  public static void main(String args[]) {
    Vector v = new Vector();
    v.add("Ayush");
    v.add("Amit");
    v.add("Ashish");
    v.add("Garima");
    // v.add(new Integer(45));
    Iterator<String> itr = v.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
    System.out.println("Size=" + v.size());
    v.removeElement("Ayush");
    System.out.println("After remove=" + v);
    v.removeElementAt(2);
    System.out.println("After remove=" + v);
    String str[] = new String[10];
    v.copyInto(str);
    v.add("Ayush");
    v.add("Garima");
    v.setElementAt("AAAA", 2);
    System.out.println("After set=" + v);
  }
}