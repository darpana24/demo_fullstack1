
//create arraylist class object for emp class display 
//the info of emp in sorted order acc name
import java.io.*;
import java.util.*;

class Emp6 {
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

  public void put() {
    System.out.println("Emp no=" + eno);
    System.out.println("Emp name=" + name);
    System.out.println("Emp sal=" + sal);

  }
}

class sortbyname implements Comparator<Emp6> {
  public int compare(Emp6 a, Emp6 b) {
    return (a.name).compareTo(b.name);
  }
}

public class Linkedlistdemo1 {
  public static void main(String args[]) throws Exception {
    Emp6 e1[] = new Emp6[3];
    System.out.println("Enter info of emp");
    for (int i = 0; i < 3; i++) {
      e1[i] = new Emp6();
      e1[i].getemp();
    }
    LinkedList<Emp6> obj = new LinkedList<Emp6>();
    Collections.addAll(obj, e1);
    Collections.sort(obj, new sortbyname());
    // Collections.reverse(obj);
    System.out.println("After sort");

    for (int i = 0; i < obj.size(); i++) {
      Emp6 e = (Emp6) obj.get(i);
      e.put();
    }
    Emp6 e2 = new Emp6();
    e2.getemp();
    obj.addFirst(e2);
  }
}
