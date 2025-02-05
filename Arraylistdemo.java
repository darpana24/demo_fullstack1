
//demo for arraylist 
//1. add elements into arraylist object
//2. Display Arraylist object
//3. Add element at end of array
//4. Insert element into array
import java.util.*;

class Arraylistdemo {
  public static void main(String args[]) {
    String str[] = { "aaa", "bbb", "ccc", "ddd" };
    ArrayList<String> obj = new ArrayList();
    Collections.addAll(obj, str);
    // for(int i=0;i<str.length;i++)
    // obj.add(str[i]);
    System.out.println("Array list");
    Iterator it = obj.iterator();
    while (it.hasNext()) {
      String str1 = (String) it.next();
      System.out.println(str1);
    }
    obj.add("eee");
    System.out.println(" After add Array list");
    Iterator it1 = obj.iterator();
    while (it1.hasNext()) {
      String str1 = (String) it1.next();
      System.out.println(str1);
    }
    System.out.println("After insert Array list");
    obj.add(2, "ttt");
    for (int i = 0; i < obj.size(); i++)
      System.out.println("" + obj.get(i));
    System.out.println("Index of=" + obj.indexOf("ccc"));
    System.out.println("Index of=" + obj.lastIndexOf("ccc"));

  }
}
