package com.kashfabbas.sort;

public class InsertionSort {
  //                BEST         PASS
  // ----------------------------------------
  //   Iteration    O(n)         O(n)
  // Shift Items    O(1)         O(n)
  //       Total    O(n)         O(n^2)
//                  Linear       Quadratic

  public void sort(int[] array) {
    for (var i = 1; i < array.length; i++) {
      var current = array[i];
      var j = i - 1;
      while (j >= 0 && array[j] > current) {
        array[j + 1] = array[j];
        j--;
      }
      array[j + 1] = current;
    }
  }
}
