import com.kashfabbas.trie.Trie;

public class Main {
  public static void main(String[] args) {
    var trie = new Trie();
//    trie.insert("cat");
//    trie.insert("canada");
//    System.out.println("Done");
//    System.out.println(trie.contains("canada"));
//    trie.traverse();
    trie.insert("car");
    trie.insert("care");
    trie.remove("car");
    System.out.println(trie.contains("car"));
    System.out.println(trie.contains("care"));

    var trie2 = new Trie();
    trie2.insert("car");
    trie2.insert("card");
    trie2.insert("care");
    trie2.insert("careful");
    trie2.insert("egg");
    var words = trie2.findWords("e");
    System.out.println(words);
  }
}