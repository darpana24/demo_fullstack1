import java.util.*;
class Student43
{  
public static void main(String args[])
     {
        Student1 s=new Student1();
        s.getstu();
       ArrayList<Student1> obj=new ArrayList<Student1>();
       obj.add(s);
    Student1 s1=new Student1();
        s1.getstu();
       obj.add(s1);
     //Comparator com=Collections.reverseOrder();
     Collections.sort(obj);
       Iterator it=obj.iterator();
      while(it.hasNext())
     {  
     
        Student1 e1=(Student1)it.next();
       e1.putstu();
      }
      //s.put();
    }
}