
//enter n string print in  reverse order
import java.io.*;
import java.util.*;

class Arraylist5 {
   public static void main(String args[]) throws IOException {
      String str;
      int i, n;
      ArrayList<String> obj = new ArrayList();
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("enter value of n");
      n = Integer.parseInt(br.readLine());
      System.out.println("Enter n string");
      for (i = 1; i <= n; i++) {
         str = br.readLine();
         obj.add(str);
      }
      Collections.reverse(obj);
      System.out.println("after reverse output");
      Iterator it = obj.iterator();
      while (it.hasNext()) {
         String str1 = (String) it.next();
         System.out.println(str1);
      }
      Collections.sort(obj);
      System.out.println("after sortoutput");
      it = obj.iterator();
      while (it.hasNext()) {
         String str1 = (String) it.next();
         System.out.println(str1);
      }
   }
}
