
//enter 10 string print in  assending order


import java.io.*;
import java.util.*;
class Linklistdemo2
{
  public static void main(String args[]) throws IOException
  {
     String str;
     int i;
      LinkedList<String>  obj=new LinkedList();
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter 10 string");
     for(i=1;i<=10;i++)
     {
        str=br.readLine();
        obj.add(str);
       }
     //Comparator com=Collections.reverseOrder();
     //Collections.sort(obj,com);
     Collections.sort(obj);
      System.out.println("output");
       Iterator it=obj.iterator();
       while(it.hasNext())
       {
          String str1=(String)it.next();
          System.out.println(str1);
      }
  }
}      






 