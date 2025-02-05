import java.util.*;

class Linklistdemo {
  public static void main(String args[]) {
    String str[] = { "aaa", "bbb", "ccc", "ddd" };
    LinkedList<String> obj = new LinkedList();
    Collections.addAll(obj, str);
    System.out.println("Linked list");
    Iterator it = obj.iterator();
    while (it.hasNext()) {
      String str1 = (String) it.next();
      System.out.println(str1);
    }
    obj.addFirst("zzz");
    obj.addLast("UUU");
    System.out.println("After add element");
    for (int i = 0; i < obj.size(); i++)
      System.out.println("" + obj.get(i));
    obj.add(3, "ttt");
    System.out.println("After add element");
    for (int i = 0; i < obj.size(); i++)
      System.out.println("" + obj.get(i));
    System.out.println("Index of=" + obj.indexOf("ccc"));
    obj.remove(2);
    obj.removeFirst();
    obj.removeLast();
    System.out.println("After remove");
    for (int i = 0; i < obj.size(); i++)
      System.out.println("" + obj.get(i));
    obj.sort(new sortstr());
    System.out.println("After sort");
    for (int i = 0; i < obj.size(); i++)
      System.out.println("" + obj.get(i));
  }
}

class sortstr implements Comparator<String> {
  public int compare(String a, String b) {
    return a.compareTo(b);
  }
}
