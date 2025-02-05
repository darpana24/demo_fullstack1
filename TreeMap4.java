import java.util.*;  
class TreeMap4{  
 public static void main(String args[]){  
   SortedMap<Integer,String> map=new TreeMap<Integer,String>();    
       
      map.put(102,"Ravi");    
      map.put(101,"Vijay");    
map.put(100,"Amit");         
map.put(103,"Rahul");   
System.out.println("Map="+map); 
     
        map.remove(102);
System.out.println("After remove Map="+map); 
 map.replace(101,"Sunil");
System.out.println("After Replace Map="+map); 
 }  
}  