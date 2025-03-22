import com.kashfabbas.binarytree.Tree;

public class Main {
  public static void main(String[] args) {

    Tree tree = new Tree();
    tree.insert(7);
    tree.insert(4);
    tree.insert(9);
    tree.insert(1);
    tree.insert(6);
    tree.insert(8);
    tree.insert(10);

    Tree tree2 = new Tree();
    tree2.insert(7);
    tree2.insert(4);
    tree2.insert(9);
    tree2.insert(1);
    tree2.insert(6);
    tree2.insert(8);
    tree2.insert(10);
//    System.out.println("Done"); // Breakpoint

    System.out.println(tree.equals(tree2));

    var list = tree2.getNodesAtDistance(2);
    for (var item : list)
      System.out.println(item);

    tree.traverseLevelOrder();

    System.out.println(tree.find(10));
    tree.traversePreOrder();
    tree.traverseInOrder();
    tree.traversePostOrder();
    System.out.println(tree.height());
    tree.swapRoot();
    System.out.println(tree.isBinarySearchTree());
  }
}