package com.kashfabbas.queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class BuiltInQueue {
  public static void main(String[] args) {
    Queue<Integer> queue = new ArrayDeque<>();  // AbstractQueue, ArrayBlockingQueue, ArrayDeque, ConcurrentLinkedDeque, ConcurrentLinkedQueue, DelayQueue, LinkedBlockingDeque, LinkedBlockingQueue, LinkedList, LinkedTransferQueue, PriorityBlockingQueue, PriorityQueue, SynchronousQueue
    queue.add(10);
    queue.add(20);
    queue.add(30);
    var front = queue.remove();
    System.out.println(front);
    System.out.println(queue);
    reverse(queue);
    System.out.println(queue);
  }

  public static void reverse(Queue<Integer> queue) {
    // Q [10, 20, 30] -> [30, 20, 10]
    // S [10, 20, 30]
    Stack<Integer> stack = new Stack<>();
    while (!queue.isEmpty())
      stack.push(queue.remove());
    while (!stack.isEmpty())
      queue.add(stack.pop());
  }
}
