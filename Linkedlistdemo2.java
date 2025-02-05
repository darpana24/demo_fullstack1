
//create linkelist class object for emp
// class display the info of given emp by eno and ename
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
    String str = "Emp no=" + eno + "\nEmp name=" + name +
        "\nSalary=" + sal;
    return (str);
  }

  public boolean equals(Object o) {
    Emp7 e = (Emp7) o;

    if (e.eno == this.eno && (e.name).equals(this.name))
      return (true);
    else
      return (false);
  }

}

public class Linkedlistdemo2 {
  public static void main(String args[]) throws Exception {
    Emp7 e1[] = new Emp7[3];
    System.out.println("Enter info of emp");
    for (int i = 0; i < 3; i++) {
      e1[i] = new Emp7();
      e1[i].getemp();
    }
    LinkedList<Emp7> obj = new LinkedList<Emp7>();
    Collections.addAll(obj, e1);
    System.out.println("Emp Information");

    for (Emp7 v : obj) {
      System.out.println("" + v);
    }
    Emp7 e = new Emp7();
    System.out.println("Enter empinfo to search");
    e.getemp();
    if (obj.contains(e))
      System.out.println("Present");
    else
      System.out.println("Not present");

  }

}
