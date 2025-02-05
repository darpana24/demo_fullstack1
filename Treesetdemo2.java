
import java.io.*;
import java.util.*;

class Treesetdemo2 {
  public static void main(String args[]) throws IOException {
    String str;
    int i;

    TreeSet<String> obj = new TreeSet();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter 10 string");
    for (i = 1; i <= 5; i++) {
      str = br.readLine();
      obj.add(str);
    }

    System.out.println("First ele=" + obj.first());
    if (obj.contains("d"))
      System.out.println("prsent");
    else
      System.out.println("not prsent");
  }
}
