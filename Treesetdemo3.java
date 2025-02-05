
//create treeset class object for emp class display info 

import java.io.*;
import java.util.*;

//import javax.lang.model.util.ElementScanner14;

class Emp7 implements Comparable<Emp7> {
  int eno;
  String ename;
  int sal;

  public void getemp() {
    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter empno");
      eno = Integer.parseInt(br.readLine());
      System.out.println("enter name");
      ename = br.readLine();
      System.out.println("Enter sal");
      sal = Integer.parseInt(br.readLine());
    } catch (IOException e) {
    }
  }

  public String toString() {
    String str = "Emp no=" + eno + "\nEmp name=" +
        ename + "\nSalary=" + sal;
    return (str);
  }

  public boolean equals(Object o) {
    // if (this == o)
    // return true;
    // if (o == null || getClass() != o.getClass())
    // return false;
    Emp7 e = (Emp7) o;
    // if(this.eno==e.eno)
    // return true;
    // else
    // return false;
    // return (this.ename).equals(e.ename);
    return this.eno == e.eno && (this.ename).equals(e.ename);
  }

  public int hashCode() {
    return Objects.hash(eno);
  }

  public int compareTo(Emp7 e) {
    return this.eno - e.eno;
    // return (this.ename).compareTo(e.ename);
  }

}

public class Treesetdemo3 {
  public static void main(String args[]) throws Exception {
    Emp7 e1[] = new Emp7[5];
    System.out.println("Enter info of emp");
    TreeSet<Emp7> obj = new TreeSet<Emp7>();
    for (int i = 0; i < 5; i++) {
      e1[i] = new Emp7();
      e1[i].getemp();

    }
    Collections.addAll(obj, e1);
    System.out.println("Emp Information=" + obj);
    Iterator o = obj.iterator();
    while (o.hasNext()) {
      Emp7 v = (Emp7) o.next();
      System.out.println("" + v);
    }

    Emp7 e2 = new Emp7();
    System.out.println("Enter emp info tobe search");
    e2.getemp();
    if (obj.contains(e2))
      System.out.println("present");
    else
      System.out.println("Not present");
  }
}
