



//to search info of given emp in treeset object 
import java.io.*;
import java.util.*;
class Emp7 implements Comparable<Emp7>
{
   int eno;
   String name;
   int sal;
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
 public void getempno()
   {
       try
       {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter empno");
          eno=Integer.parseInt(br.readLine());
       
        }catch(IOException e)
         {}
      }

          public String toString()
          {
              String str="Emp no="+eno+"\nEmp name="+name+"\nSalary="+sal;
             return(str);
          }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp7 e = (Emp7) o;
        return this.eno == e.eno;
    }
    public int hashCode() {
        return Objects.hash(eno);
    }
       
    public int compareTo(Emp7 e) {
        return this.eno- e.eno;
    }

   
}
public class Treesetdemo4
{
  public static void main(String args[]) throws Exception
  {
      Emp7 e1[]=new Emp7[5];
   System.out.println("Enter info of emp");
    TreeSet<Emp7> obj=new TreeSet<Emp7>(); 
  for(int i=0;i<5;i++)
   {
      e1[i]=new Emp7();
       e1[i].getemp();
        
   }  
Collections.addAll(obj,e1);
  
System.out.println("Enter emp no tobe search");
 Emp7 e2=new Emp7();
 e2.getempno();
 if(obj.contains(e2))
   System.out.println("present");
else
 System.out.println("Not present");
}
}





          














