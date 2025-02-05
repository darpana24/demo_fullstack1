import java.util.*;
class Student4
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
       Object e=it.next();
        Student1 e1=(Student1)e;
       //e1.put();
      }
      //s.put();
    }
}