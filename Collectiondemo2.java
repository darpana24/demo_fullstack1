//create arraylist class object for emp class display the info
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
public class Collectiondemo2
{
  public static void main(String args[]) throws Exception
  {
     int veno,vsal;
     String vname;
   
     Emp e1=new Emp();
     e1.getemp();
Emp e2=new Emp();
     e2.getemp();
Emp e3=new Emp();
     e3.getemp();
    ArrayList<Emp> obj=new ArrayList();
   obj.add(e1);
 obj.add(e2);
 obj.add(e3);
 Emp e;
    Iterator it=obj.iterator();
     while(it.hasNext())
      {
          e=(Emp)it.next();
          e.put();
         }
    }
}








          














