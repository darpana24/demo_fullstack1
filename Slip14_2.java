
/*Construct linked list containing names of colors:red,blue,
yellow and orange. Then extend your program to do the following.
a.    Display the contents of the list using an Iterator.
b.    Display the contents of the list in reverse order 
using ListIterator. 
c.    Create another list containg pink and green.
 Insert the elements of the list between blue and yellow.*/
import java.util.*;

class Slip14_2 {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add("Red");
        ll.add("Blue");
        ll.add("Yellow");
        ll.add("Orange");
        Iterator i = ll.iterator();
        System.out.println("\ncontents of the List using an Iterator:\n");
        while (i.hasNext()) {
            String s = (String) i.next();
            System.out.println(s);
        }

        ListIterator li = ll.listIterator();
        while (li.hasNext()) {
            // String elt = (String)
            li.next();
        }
        System.out.println("\ncontents of the List in reverse order using a ListIterator : ");
        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }
        ll.add(2, "Pink"); // add element at second position
        ll.add(3, "Green"); // add element at 3rd position
        System.out.println("\nlist between blue and yellow is:");
        System.out.println(ll);
        Iterator i1 = ll.iterator();
        System.out.println("\ncontents of the List using an Iterator:\n");
        while (i1.hasNext()) {
            String s = (String) i1.next();
            System.out.println(s);
        }
    }
}
