import com.kashfabbas.hashtables.CharFinder;
import com.kashfabbas.hashtables.HashTable;

import java.util.Map;

public class Main {
  public static void main(String[] args) {
    // a green apple
    CharFinder finder = new CharFinder();
    var ch = finder.findFirstNonRepeatingChar("a green apple");
    System.out.println(ch);

    // green apple
    var ch2 = finder.findFirstRepeatedChar("green apple");
    System.out.println(ch2);

    HashTable table = new HashTable();
    table.put(1, "A");  // 1
    table.put(2, "B");  // 3
    table.put(3, "C");
    table.put(4, "A+");
    table.remove(2);
    System.out.println(table.get(4));
  }
}