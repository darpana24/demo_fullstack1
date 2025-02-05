
/*Write a program to create link list of integer objects. Do the following :
i) add element at the first position.
ii) delete last element
iii) display the size of the linklist.
*/
import java.io.*;
import java.util.*;
class Collectiondemo14
{
  public static void main(String args[]) throws IOException
  {
      int i,val;
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      LinkedList<Integer>  obj=new LinkedList<Integer>();
      System.out.println("Enter values");
        for(i=1;i<=10;i++)
     {
       val=Integer.parseInt(br.readLine());
      obj.add(new Integer(val));
       }
       obj.addFirst(new Integer(100));
        System.out.println("After adding value at 1st pos output");
       Iterator it=obj.iterator();
       while(it.hasNext())
       {
           Integer str1=(Integer)it.next();
          System.out.println(str1);
      }
     obj.removeLast();
    System.out.println("After removing last element output");
        it=obj.iterator();
       while(it.hasNext())
       {
          Integer str1=(Integer)it.next();
          System.out.println(str1);
      }
   System.out.println("size ="+obj.size());
  }
}      

