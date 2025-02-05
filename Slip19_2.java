/*Accept n integers from the user and store them 
into the collection. 
Display them in the sorted order. 
The collection should not accept duplicate elements
 (Use suitable collection). 
 Search for the particular element using predefined 
 search method in the collection framework.*/
/* Slip 19_2 : */

import java.util.*;
import java.io.*;

class Slip19_2 {
    public static void main(String[] args) throws Exception {
        int no, element, i;
        BfferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TreeSet ts = new TreeSet();
        System.out.println("Enter the of elements :");
        no = Integer.parseInt(br.readLine());
        for (i = 0; i < no; i++) {
            System.out.println("Enter the element : ");
            element = Integer.parseInt(br.readLine());
            ts.add(element);
        }

        System.out.println("The elements in sorted order :" + ts);
        System.out.println("Enter element to be serach : ");
        element = Integer.parseInt(br.readLine());
        if (ts.contains(element))
            System.out.println("Element is found");
        else
            System.out.println("Element is NOT found");
    }
}
