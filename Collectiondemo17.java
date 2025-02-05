
/*Write a program to create link list of integer objects. Do the following :
i) add element at the first position.
ii) delete last element
iii) display the size of the linklist.
*/
import java.io.*;
import java.util.*;
class Collectiondemo17
{
  public static void main(String args[]) throws IOException
  {
      int i,val;
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      LinkedList<String>  obj=new LinkedList<String>();
      System.out.println("Enter values");
        obj.add("red");
        obj.add("blue");
        obj.add("Yellow");
        
        obj.add("Orange");
       obj.addFirst("black");
        System.out.println("After adding value at 1st pos output");
       Iterator it=obj.iterator();
       while(it.hasNext())
       {
           String str1=(String)it.next();
          System.out.println(str1);
      }
     obj.removeLast();
    System.out.println("After removing last element output");
        it=obj.iterator();
       while(it.hasNext())
       {
          String str1=(String)it.next();
          System.out.println(str1);
      }

   LinkedList<String> obj1=new LinkedList<String>();
     obj1.add("Pink");
     obj1.add("Green");
       i=obj.indexOf("blue");
    obj.addAll(i+1,obj1);
 System.out.println("After Insert output");
        it=obj.iterator();
       while(it.hasNext())
       {
          String str1=(String)it.next();
          System.out.println(str1);
      }
   System.out.println("size ="+obj.size());
  }
}      

