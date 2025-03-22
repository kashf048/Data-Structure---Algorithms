package com.kashfabbas.sort;

import java.util.Arrays;

public class CountingSort {
  // Space: O(k)
  // Time:
    // Populate counts    O(n)
    //  Iterate counts    O(k)
    //           Total    O(n)

  public void sort(int[] array, int max) {
    int[] counts = new int[max + 1];
    for (var item : array)
      counts[item]++;

    var k = 0;
    for (var i = 0; i < counts.length; i++)
      for (var j = 0; j < counts[i]; j++)
        array[k++] = i;
  }
}
