
import java.io.*;
import java.util.*;
class Emp
{
   private int eno;
   private String name;
   private int sal;
   public void getemp()
   {
       try
       {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter empno");
          eno=Integer.parseInt(br.readLine());
        System.out.println("enter name");
         name=br.readLine();
        System.out.println("Enter sal");
          sal=Integer.parseInt(br.readLine());
        }catch(IOException e)
         {}
      }
     
      public void put()
      {
          System.out.println("Emp no="+eno);
         System.out.println("Emp name="+name);
        System.out.println("Emp sal="+sal);
 
       }
}
class Collectiondemo7
{
  public static void main(String args[])
  {
     LinkedList<Emp> obj=new LinkedList();
    for(int i=1;i<=2;i++)
    {
       Emp e1=new Emp();    
        e1.getemp();
        obj.add(e1);
     }
    Emp e2=new Emp();    
        e2.getemp();
     obj.addFirst(e2);
  System.out.println("Info of emp");
     Iterator it=obj.iterator();
     while(it.hasNext())
      {
         Emp e=(Emp)it.next();
         e.put();
      }
  }
}