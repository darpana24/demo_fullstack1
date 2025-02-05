
//create arraylist class object for emp class display 
//the info of emp in sorted order acc name
import java.io.*;
import java.util.*;

class Emp3 {
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

class sortbyname implements Comparator<Emp3> {
  public int compare(Emp3 a, Emp3 b) {
    // if((a.name).compareTo(b.name)>0)
    // return(1);
    // else if((a.name).compareTo(b.name)==0 && a.sal>b.sal)
    // return(1);
    // else
    // return(-1);
    return (a.name).compareTo(b.name);
  }
}

public class Arraylist4 {
  public static void main(String args[]) throws Exception {
    Emp3 e1[] = new Emp3[3];
    System.out.println("Enter info of emp");
    for (int i = 0; i < 3; i++) {
      e1[i] = new Emp3();
      e1[i].getemp();
    }
    ArrayList<Emp3> obj = new ArrayList<Emp3>();
    Collections.addAll(obj, e1);
    Collections.sort(obj, new sortbyname());
    System.out.println("After sort");

    for (int i = 0; i < obj.size(); i++) {
      Emp3 e = (Emp3) obj.get(i);
      e.put();
    }
  }
}
