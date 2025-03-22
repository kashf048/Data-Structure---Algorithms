import com.kashfabbas.queue.ArrayQueue;
import com.kashfabbas.queue.QueueWithTwoStacks;

import java.util.PriorityQueue;

public class Main {
  public static void main(String[] args) {
    ArrayQueue queue = new ArrayQueue(5);   // Press AQ
    queue.enqueue(10);
    queue.enqueue(20);
    queue.enqueue(30);
    queue.dequeue();
    var front = queue.dequeue();
    queue.enqueue(40);
    queue.enqueue(50);
    queue.enqueue(60);
    queue.enqueue(70);
    System.out.println(front);
    System.out.println(queue);


    // QueueWithTwoStack
    QueueWithTwoStacks queue2 = new QueueWithTwoStacks();
    queue2.enqueue(10);
    queue2.enqueue(20);
    queue2.enqueue(30);
    queue2.dequeue();
    var front2 = queue2.dequeue();
    System.out.println(front2);

    // Priority Queue built-in
    PriorityQueue<Integer> queue3 = new PriorityQueue<>();
    queue3.add(3);
    queue3.add(1);
    queue3.add(4);
    queue3.add(2);
    while (!queue3.isEmpty())
      System.out.println(queue3.remove());

    // Priority Queue
    // insert(2)
    // [1, 2, 3, 4, 5]
    //  0  1  2  3  4
    // items[i + 1] = items[i]
    com.kashfabbas.queue.PriorityQueue queue4 = new com.kashfabbas.queue.PriorityQueue(5);
    queue4.add(4);
    queue4.add(2);
    queue4.add(1);
    queue4.add(3);
    queue4.add(5);
    System.out.println(queue4);

    while (!queue4.isEmpty())
      System.out.println(queue4.remove());
  }
}