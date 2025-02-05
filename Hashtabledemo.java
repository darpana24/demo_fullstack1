
/*Create the Hashtable that will maintain the mobile number 
and student name. Display the contact list.*/
import java.io.*;
import java.util.*;

class Hashtabledemo {
  public static void main(String args[]) throws IOException {
    String str;
    int i;
    Hashtable obj = new Hashtable();
    obj.put("www", "3456677");
    obj.put("aaa", "45678");
    obj.put("bbb", "456567");
    System.out.println("output");
    Enumeration names = obj.keys();
    while (names.hasMoreElements()) {
      str = (String) names.nextElement();
      System.out.println("Name=" + str + "  contact no=" +
          obj.get(str));
    }
  }
}
