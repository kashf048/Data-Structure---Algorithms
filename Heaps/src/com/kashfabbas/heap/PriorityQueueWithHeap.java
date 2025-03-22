package com.kashfabbas.heap;

import java.util.Arrays;

public class PriorityQueueWithHeap {
  private Heap heap = new Heap();

  public void enque(int item) {
    heap.insert(item);
  }

  public int deque() {
    return heap.remove();
  }

  public boolean isEmpty() {
    return heap.isEmpty();
  }

  public static void main(String[] args) {
    var heap1 = new PriorityQueueWithHeap();
    heap1.enque(40);
    heap1.enque(30);
    heap1.enque(20);
    heap1.enque(10);
    heap1.enque(5);
    var remove = heap1.deque();
    System.out.println(remove);
  }
}
