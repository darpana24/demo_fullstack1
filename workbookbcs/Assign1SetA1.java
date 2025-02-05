/* Accept n integers from user and store them in collection. Display them in the sored order. The collection should not accept duplicate elements.(use suitable collection).Search for an particular element using predefined search method in the collection framework.*/

import java.util.*;
class Assign1SetA1
{
  public static void main(String args[])
  {
    TreeSet obj=new TreeSet();
    obj.add(new Integer(10));
    obj.add(new Integer(5));
    obj.add(new Integer(20));
    obj.add(new Integer(15));
   obj.add(new Integer(8));
   Iterator it=obj.iterator();
   while(it.hasNext())
   {
     System.out.println(""+it.next());
   }
   if(obj.contains(new Integer(15)))
      System.out.println("Present");
   else 
      System.out.println("Not present");
}
}
 