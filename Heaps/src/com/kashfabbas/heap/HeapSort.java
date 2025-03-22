package com.kashfabbas.heap;

import java.util.Arrays;

public class HeapSort {
  public static void main(String[] args) {
    int[] numbers = { 5, 3, 10, 1, 4, 2 };
    var heap = new Heap();
    for (var number : numbers)
      heap.insert(number);
//    while (!heap.isEmpty())   // DESC order while
//      System.out.println(heap.remove());
//    for (var i = 0; i < numbers.length; i++)  // DESC order for loop
//      numbers[i] = heap.remove();
    for (var i = numbers.length - 1; i >= 0; i--)  // ASC order for loop
      numbers[i] = heap.remove();

    System.out.println(Arrays.toString(numbers));
  }
}
