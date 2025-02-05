/*Write a program that uses the Hashtable class for storing and retrieving student records.*/
import java.util.*;
class Student2
{  
public static void main(String args[])
     {
        Student1 s=new Student1();
        s.getstu();
       HashSet<Student1> obj=new HashSet<Student1>();
       obj.add(s);
    Student1 s1=new Student1();
        s1.getstu();
       obj.add(s1);
       Iterator it=obj.iterator();
      while(it.hasNext())
     {  
       Student1 e=(Student1)it.next();
        e.putstu();
      }
      //s.put();
    }
}