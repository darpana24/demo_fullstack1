import java.util.*;  
class HashTabledemo1{  
 public static void main(String args[]){  
  Hashtable<Integer,String> map=new Hashtable
  <Integer,String>();  
  
  map.put(100,"Amit");  
  map.put(102,"Ravi");  
  map.put(101,"Vijay");  
  map.put(103,"Rahul");  
  map.put(103,"Ram");  
  
  for(Map.Entry m:map.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
}
 map.remove(102);  
       System.out.println("After remove: "+ map);  

 System.out.println(map.getOrDefault
 (101, "Not Found"));  
     System.out.println(map.getOrDefault
     (105, "Not Found"));  

map.putIfAbsent(104,"Gaurav");  
     System.out.println("Updated Map: "+map);  
     //Returns the current value, as the specified pair 
     //already exist  
     map.putIfAbsent(101,"Vinod");  
     System.out.println("Updated Map: "+map);  
    
 }  
}  