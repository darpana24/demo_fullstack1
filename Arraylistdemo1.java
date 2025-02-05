//demo for contains function
import java.util.*;
class Arraylistdemo1
{
  public static void main(String args[])
  {
    String str[]={"aaa","bbb","ccc","ddd"};
    ArrayList<String> obj=new ArrayList();
    Collections.addAll(obj,str);
    if(obj.contains("ccc"))
      System.out.println("Element is present");
   else
     System.out.println("Elements is not present");
   }
}
       





   









