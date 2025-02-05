
//create arraylist class object for emp class display 
//the info of emp in reverse order
import java.io.*;
import java.util.*;

class Emp4 {
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

public class Arraylist6 {
    public static void main(String args[]) throws Exception {
        Emp4 e1[] = new Emp4[3];
        System.out.println("Enter info of emp");
        for (int i = 0; i < 3; i++) {
            e1[i] = new Emp4();
            e1[i].getemp();
        }
        ArrayList<Emp4> obj = new ArrayList<Emp4>();
        Collections.addAll(obj, e1);
        Collections.reverse(obj);
        System.out.println("After reverse");

        for (int i = 0; i < obj.size(); i++) {
            Emp4 e = (Emp4) obj.get(i);
            e.put();
        }
    }
}
