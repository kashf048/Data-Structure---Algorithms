import com.kashfabbas.avltree.AVLTree;

public class Main {
  public static void main(String[] args) {
    // 10     // 10 is right heavy
    //    20
    //       30
    // 30     // 30 is left heavy
    //    20
    //       10
    var tree = new AVLTree();
    tree.insert(10);
    tree.insert(30);
    tree.insert(20);
  }
}