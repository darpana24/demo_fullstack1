/*Create a hash table containing student name 
and percentage. Display the details of hash table. 
Also search for the specific student and 
display percentage of that student.
/* Slip no : 15_2*/

import java.io.*;
import java.util.*;

class Slip15_2 {
  public static void main(String args[]) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Hashtable ht = new Hashtable();
    float per;
    String name = null;
    System.out.println("\n Enter no of Students : ");
    int n = Integer.parseInt(br.readLine());
    for (int i = 0; i < n; i++) {
      System.out.print("Enter Student name :");
      name = br.readLine();
      System.out.print("Enter Student's per :");
      per = Float.parseFloat(br.readLine());
      ht.put(name, per);
    }
    System.out.println("Hash table = " + ht);
    Enumeration k = ht.keys();
    Enumeration v = ht.elements();
    System.out.println("ID\tName");
    while (k.hasMoreElements()) {
      System.out.println(k.nextElement() + "\t" + v.nextElement());
    }
    System.out.println("Enter name to be search : ");
    String snm = br.readLine();
    k = ht.keys();
    v = ht.elements();
    int cnt = 0;
    if (ht.containsKey(snm)) {
      System.out.println("Per=" + ht.get(snm));
    } else
      System.out.println("name not present");
  }
}
