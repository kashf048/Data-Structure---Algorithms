import com.kashfabbas.graph.Graph;

public class Main {
  public static void main(String[] args) {
    var graph = new Graph();
//    graph.addNode("A");
//    graph.addNode("B");
//    graph.addNode("C");
//    graph.addEdge("A", "B");
//    graph.addEdge("A", "C");
//    graph.removeEdge("A", "B");
////    graph.removeNode("C");
//    graph.print();

//    graph.addNode("A");
//    graph.addNode("B");
//    graph.addNode("C");
//    graph.addNode("D");
//    graph.addEdge("A", "B");
//    graph.addEdge("B", "D");
//    graph.addEdge("D", "C");
//    graph.addEdge("A", "C");
//    graph.traverseDepthFirst("A");  // B, C, D
//    graph.traverseDepthFirstRec("A");  // B, C, D
//    graph.traverseBreadthFirst("C");


//    graph.addNode("X");
//    graph.addNode("A");
//    graph.addNode("B");
//    graph.addNode("P");
//    graph.addEdge("X", "A");
//    graph.addEdge("X", "B");
//    graph.addEdge("A", "P");
//    graph.addEdge("B", "P");
//    var list = graph.topologicalSort();
//    System.out.println(list);


    graph.addNode("A");
    graph.addNode("B");
    graph.addNode("C");
    graph.addEdge("A", "B");
    graph.addEdge("B", "C");
    graph.addEdge("C", "A");  // Change direction A to C, C to A
    var cycle = graph.hasCycle();
    System.out.println(cycle);
  }
}