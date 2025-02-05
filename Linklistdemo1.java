



import java.util.*;
class Linklistdemo1
{
  public static void main(String args[])
  {
    String str[]={"aaa","bbb","ccc","ddd"};
    LinkedList<String> obj=new LinkedList();
    Collections.addAll(obj,str);
    if(obj.contains("ccc"))
      System.out.println("Element is present");
   else
     System.out.println("Elements is not present");
   }
}
       





   









