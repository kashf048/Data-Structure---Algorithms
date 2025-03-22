package com.kashfabbas.sort;

public class QuickSort {
  //                      BEST          PASS
  // --------------------------------------------
  //      Partitioning    O(n)          O(n)
  //        # of times    O(log n)      O(n)
  //             Total    O(n log n)    O(n^2)
  //             Space    O(log n)      O(n)


  // 0, 9
  // 4 pivot
  // 1, 3 (left)
  // 5, 9 (right)

  public void sort(int[] array) {
    sort(array, 0, array.length - 1);
  }

  private void sort(int[] array, int start, int end) {
    if (start >= end)
      return;

    // Partitioning
    var boundary = partition(array, start, end);

    // Sort left
    sort(array, start, boundary - 1);
    // Sort right
    sort(array, boundary + 1, end);
  }

  private int partition(int[] array, int start, int end) {
    var pivot = array[end];
    var boundary = start - 1;
    for (var i = start; i <= end; i++)
      if (array[i] <= pivot)
//        boundary++;
        swap(array, i, ++boundary);

    return boundary;
  }

  private void swap(int[] array, int index1, int index2) {
    var temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;
  }
}
