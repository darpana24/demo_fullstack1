import java.util.*;

class Book {
    int id;
    String name, author, publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    public String toString() {
        return (id + " " + name + " " + author + " " + publisher + " " + quantity);
    }
}

public class HashTabledemo2 {
    public static void main(String[] args) {
        // Creating map of Books
        
        Hashtable map = new Hashtable();
        // Creating Books
        Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
        // Adding Books to map
        map.put(1, b1);
        map.put(2, b2);
        map.put(3, b3);
        Enumeration e = map.keys();
        while (e.hasMoreElements()) {
            int i = (int) e.nextElement();
            System.out.println("Key=" + i + "  Book info=" +
                    map.get(i));
        }
         Map<Integer,Book> map1=new Hashtable<Integer,Book>();
        //Traversing map
        for (Map.Entry<Integer, Book> entry : map1.entrySet()) {
        int key = entry.getKey();
        Book b = entry.getValue();
        System.out.println(key + " Details:=" + b);
        }

    }
}