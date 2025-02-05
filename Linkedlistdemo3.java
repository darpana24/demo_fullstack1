
//create linkelist class object for emp class 
//display info in reverse order
import java.io.*;
import java.util.*;

class Emp7 {
   int eno;
   String name;
   int sal;

   public void getemp() {
      try {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter empno");
         eno = Integer.parseInt(br.readLine());
         System.out.println("enter name");
         name = br.readLine();
         System.out.println("Enter sal");
         sal = Integer.parseInt(br.readLine());
      } catch (IOException e) {
      }
   }

   public String toString() {
      String str = "Emp no=" + eno + "\nEmp name=" + name + "\nSalary=" + sal;
      return (str);
   }

}

public class Linkedlistdemo3 {
   public static void main(String args[]) throws Exception {
      Emp7 e1[] = new Emp7[3];
      System.out.println("Enter info of emp");
      for (int i = 0; i < 3; i++) {
         e1[i] = new Emp7();
         e1[i].getemp();
      }
      LinkedList<Emp7> obj = new LinkedList<Emp7>();
      Collections.addAll(obj, e1);
      Collections.reverse(obj);
      System.out.println("Emp Information");

      for (Emp7 v : obj) {
         System.out.println("" + v);
      }
   }

}
