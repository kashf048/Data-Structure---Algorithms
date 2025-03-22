package com.kashfabbas.sort;

public class SelectionSort {
  //                BEST         PASS
  // ----------------------------------------
  //      Passes    O(n)         O(n)
  // Comparisons    O(n)         O(n)
  //       Total    O(n^2)       O(n^2)
//                  Quadratic    Quadratic

  public void sort(int[] array) {
    for (var i = 0; i < array.length; i++) {
      var minIndex = getMinIndex(array, i);
      swap(array, minIndex, i);
    }
  }

  private static int getMinIndex(int[] array, int i) {
    var minIndex = i;
    for (var j = i; j < array.length; j++)
      if (array[j] < array[minIndex])
        minIndex = j;
    return minIndex;
  }

  private void swap(int[] array, int index1, int index2) {
    var temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;
  }
}
