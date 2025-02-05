
//create arraylist class object for 
//emp class display the info in asc order acc sal
import java.io.*;
import java.util.*;

class Emp2 {
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

  // public void put() {
  // System.out.println("Emp no=" + eno);
  // System.out.println("Emp name=" + name);
  // System.out.println("Emp sal=" + sal);

  // }
  public String toString() {
    String str = "";
    str = "Emp no=" + eno + "\nEmp Name=" + name +
        "\nSalary=" + sal;
    return str;
  }
}

class sortbysal implements Comparator<Emp2> {
  public int compare(Emp2 a, Emp2 b) {
    return b.sal - a.sal;
  }
}

public class Arraylist3 {
  public static void main(String args[]) throws Exception {
    Emp2 e1[] = new Emp2[3];
    System.out.println("Enter info of emp");
    for (int i = 0; i < 3; i++) {
      e1[i] = new Emp2();
      e1[i].getemp();
    }
    ArrayList<Emp2> obj = new ArrayList<Emp2>();
    Collections.addAll(obj, e1);
    Collections.sort(obj, new sortbysal());
    // Collections.reverse(obj);

    System.out.println("After sort");

    for (int i = 0; i < obj.size(); i++) {
      Emp2 e = (Emp2) obj.get(i);
      System.out.println("Emp=" + e);
    }
  }
}
