import java.util.*;  
public class Vectordemo1{  
public static void main(String args[]){  
Vector<String> v=new Vector<String>(10);  
v.add("Ayush");  
v.add("Amit");  
v.add("Ashish");  
v.add("Garima"); 
v.add("Sunil");  
Iterator<String> itr=v.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  

}  
System.out.println("Size="+v.size());
System.out.println("Capacity="+v.capacity());
v.removeElement("Ayush");
System.out.println("After remove="+v);
v.removeElementAt(2);
System.out.println("After remove=");
for(String v1:v)
{
  System.out.println(v1);
}
String str[]=new String[10];
v.copyInto(str);
v.setElementAt("AAAA",2);
System.out.println("After set="+v);
}
}  