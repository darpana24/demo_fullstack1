
import java.util.*;

class Stackdemo {
  public static void main(String args[]) {
    Stack stk = new Stack();
    stk.push("Apple");
    stk.push("Orange");
    stk.push("Banana");
    stk.push("Grapes");
    stk.push("Mango");
    stk.push("Custerd Apple");

    System.out.println("Popped=" + stk.pop());
    // System.out.println("Popped=" + stk.peek());
    if (stk.empty())
      System.out.println("Stack is empty");
    else
      System.out.println("Stack is not empty");

    // System.out.println("Stack Element");
    // Iterator obj = stk.iterator();
    // while (obj.hasNext()) {
    // String str = (String) obj.next();
    // System.out.println(str);
    // }

    // System.out.println("Stack Element");
    // ListIterator obj1 = stk.listIterator(stk.size());
    // while (obj1.hasPrevious()) {
    // String str = (String) obj1.previous();
    // System.out.println(str);
    // }

  }
}
