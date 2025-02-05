
/*Create the Hashtable that will maintain the mobile number and student name. Display the contact list.*/
import java.io.*;
import java.util.*;
class Collectiondemo13
{
  public static void main(String args[]) throws IOException
  {
     String str;
     int i;
     Hashtable obj=new Hashtable();
    obj.put("www",new Long(123456));
    obj.put("aaa",new Long(567896));
    obj.put("bbb",new Long(23456));    
        System.out.println("output");
      Enumeration names=obj.keys();
    while(names.hasMoreElements())
    {
       str=(String)names.nextElement();
       System.out.println("Name="+str+"  contact no="+obj.get(str));
    }
  }
}
    

