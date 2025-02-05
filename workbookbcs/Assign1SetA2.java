



/* construct a linked list conataing names of colors red,blue ,yellow,orange. Then extends your program to do the following.
1)Display the contents of the list using iteraot
2)Display the contents of the list in reverse order using a listiteraor
3)Create another list containing pink and green. Insert the elements of this list between blue and yellow.
*/
import java.util.*;
class Assign1SetA2
{
  public static void main(String args[])
  {
    LinkedList obj=new LinkedList();
    obj.add("red");
   obj.add("blue"); 
   obj.add("yellow");
  obj.add("orange");
   Iterator it=obj.iterator();
   while(it.hasNext())
   {
     System.out.println(""+it.next());
   }
  System.out.println("Linked list in reverse order");
  ListIterator it1=obj.listIterator();
 while(it1.hasNext())
 {
    it1.next();
  }
   while(it1.hasPrevious())
   {
     System.out.println(""+it1.previous());
   }
   LinkedList obj1=new LinkedList();
   obj1.add("pink");
   obj1.add("green");
   obj.addAll(2,obj1);
   System.out.println("Linked list after add");
 Iterator it2=obj.iterator();
   while(it2.hasNext())
   {
     System.out.println(""+it2.next());
   }
 }
}



