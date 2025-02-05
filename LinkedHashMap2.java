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

  public int hashCode() {
    return (name.hashCode());

  }

  public String toString() {
    return (id + " " + name + " " + author + " " + publisher + " " + quantity);
  }
}

public class LinkedHashMap2 {
  public static void main(String[] args) {
    // Creating map of Books
    Map<Integer, Book> map = new LinkedHashMap<Integer, Book>();
    // Creating Books
    Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
    Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
    Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
    // Adding Books to map
    map.put(2, b2);
    map.put(1, b1);
    map.put(3, b3);

    // Traversing map
    for (Map.Entry<Integer, Book> m : map.entrySet()) {
      int key = m.getKey();
      Book b = m.getValue();
      System.out.println(key + " Details:=" + b);
    }
    Book b4 = new Book(103, "Java", "Galvin", "PBP", 9);
    map.replace(1, b4);
    System.out.println("After replace");
    for (Map.Entry<Integer, Book> m : map.entrySet()) {
      int key = m.getKey();
      Book b = m.getValue();
      System.out.println(key + " Details:=" + b);
    }
  }
}