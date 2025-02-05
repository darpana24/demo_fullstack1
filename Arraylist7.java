
//create arraylist class object for emp class display 
//check given emp present or not
import java.io.*;
import java.util.*;

class Emp5 {
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

    public boolean equals(Object obj) {
        Emp5 e = (Emp5) obj;
        // if(eno==e.eno && name.equals(e.name) && sal==e.sal)
        // return(true);
        // else
        // return false;
        return (eno == e.eno && name.equals(e.name) && sal == e.sal);
    }
    // public int indexOf(Object obj) {
    // Emp5 e = (Emp5) obj;
    // // if(eno==e.eno && name.equals(e.name) && sal==e.sal)
    // // return(true);
    // // else
    // // return false;
    // return (eno == e.eno && name.equals(e.name) && sal == e.sal);
    // }
}

public class Arraylist7 {
    public static void main(String args[]) throws Exception {
        Emp5 e1[] = new Emp5[3];
        System.out.println("Enter info of emp");
        for (int i = 0; i < 3; i++) {
            e1[i] = new Emp5();
            e1[i].getemp();
        }
        // Emp5 e4, e5;
        // e4.equals(e5);
        ArrayList<Emp5> obj = new ArrayList<Emp5>();
        Collections.addAll(obj, e1);
        Emp5 e = new Emp5();
        System.out.println("Enter emp tobe search");
        e.getemp();
        if (obj.contains(e))
            System.out.println("Emp is present");
        else
            System.out.println("Emp is not present");
        System.out.println("Index=" + obj.indexOf(e));
    }
}
