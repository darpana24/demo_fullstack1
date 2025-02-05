
//create arraylist class object for emp class display
//the info and Emp object is array type
import java.io.*;
import java.util.*;

class Emp1 {
  private int eno;
  private String name;
  private int sal;

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

  public void put() {
    System.out.println("Emp no=" + eno);
    System.out.println("Emp name=" + name);
    System.out.println("Emp sal=" + sal);

  }

  public String toString() {
    String str = "";
    str = "Emp no=" + eno + "\nEmp Name=" + name +
        "\nSalary=" + sal;
    return str;
  }
}

public class Arraylist2 {
  public static void main(String args[]) throws Exception {

    Emp1 e1[] = new Emp1[5];
    System.out.println("Enter info of emp");
    for (int i = 0; i < 5; i++) {
      e1[i] = new Emp1();
      e1[i].getemp();
    }
    ArrayList<Emp1> obj = new ArrayList();
    Collections.addAll(obj, e1);
    Emp1 e;
    Iterator it = obj.iterator();
    System.out.println("Info of emp");
    while (it.hasNext()) {
      e = (Emp1) it.next();
      // e.put();
      System.out.println("Info=\n" + e);
    }
  }
}
