import com.Kashf.LinkedLists.LinkedList;

import java.util.Arrays;

//import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
//    LinkedList list = new LinkedList();
////    LinkedList<Integer> list = new LinkedList<>();
//    list.addLast(10);
//    list.addLast(20);
//    list.addLast(30);
//    list.addFirst(5);
//    list.add(2, 75);
//    list.removeLast();
//    list.removeFirst();
//    list.remove(1);
//    list.add(1, 50);
////    list.clear();
//    System.out.println(list.indexOf(20));
//    System.out.println("Contain: " + list.contains(10));
//    System.out.println(list.size());
//    var array = list.toArray();
//    System.out.println(Arrays.toString(array));
//    System.out.println(list);

//    java.util.LinkedList<String> x = new java.util.LinkedList<>();
//    x.removeFirst();

//    LinkedList list = new LinkedList();
    var list = new LinkedList();
//    System.out.println(list.size());
//    list.addLast(10);
//    list.addLast(20);
//    System.out.println(list.size());

//    list.removeFirst();
//    list.addLast(30);
//    list.addFirst(5);
//    list.removeLast();
//    System.out.println(list.contains(5));
//    list.reverse();
//    var array = list.toArray();
//    System.out.println(Arrays.toString(array));

//    System.out.println(list);

    list.addLast(10);
    list.addLast(20);
    list.addLast(30);
    list.addLast(40);
    list.addLast(50);
    var array = list.toArray();
    System.out.println(Arrays.toString(array));
    list.printMiddle();
    System.out.println(list.hasLoop());
    System.out.println(list.getKthFromTheEnd(4));
  }
}