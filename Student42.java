
import java.util.*;
class Student42 
{  
public static void main(String args[])
     {
        Student1 s=new Student1();
        int n;
       Scanner sc=new Scanner(System.in);
       LinkedList<Student1> obj=new LinkedList<Student1>();
      System.out.println("How many students");
       n=sc.nextInt();
      for(int i=1;i<=n;i++)
    { 
      s.getstu(); 
      obj.add(s);
      }
       Iterator it=obj.iterator();
      while(it.hasNext())
     {  
       Object e=it.next();
        Student1 e1=(Student1)e;
       e1.putstu();
      }
       }
}