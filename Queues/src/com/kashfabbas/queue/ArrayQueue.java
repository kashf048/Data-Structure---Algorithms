package com.kashfabbas.queue;

import java.util.ArrayDeque;
import java.util.Arrays;

public class ArrayQueue {
  private int[] items;
  private int rear;
  private int count;
  private int front;

  public ArrayQueue(int capacity) {
    items = new int[capacity];

  }

  public void enqueue(int item) {
    var queue = new ArrayDeque<>();
    if (count == items.length)
      throw new IllegalStateException();

    items[rear] = item;   // 5 [0 - 4]
    // Circular Array
    rear = (rear + 1) % items.length;
    count++;
  }

  public int dequeue() {
    var item = items[front];
    items[front] = 0;
    // Circular Array
    front = (front + 1) % items.length;
    count--;
    return item;
  }

  public boolean isEmpty() {
    return front == 0;
  }

//  public int peek() {
//    return front == ;
//  }

  @Override
  public String toString() {
    var content = Arrays.copyOfRange(items, 0, rear);
    return Arrays.toString(content);
  }
}
