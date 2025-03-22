package com.kashfabbas.sort;

public class MergeSort {
  //                  BEST          PASS
  // --------------------------------------------
  //      Dividing    O(log n)      O(log n)
  //       Merging    O(n)          O(n)
  //         Total    O(n log n)    O(n log n)
  //         Space    O(n)          O(n)

  public void sort(int[] array) {
    if (array.length < 2)
      return;

    // Divide this array into half
    var middle = array.length / 2;

    int[] left = new int[middle];
    for (var i = 0; i < middle; i++)
      left[i] = array[i];

    int[] right = new int[array.length - middle];
    for (var i = middle; i < array.length; i++)
      right[i - middle] = array[i];

    // Sort each half
    sort(left);
    sort(right);

    // Merge the result
    merge(left, right, array);
  }

  private void merge(int[] left, int[] right, int[] result) {
    int i = 0, j = 0, k = 0;  // i = left, j = right, k = result

    while (i < left.length && j < right.length) {
      if (left[i] <= right[j])
        result[k++] = left[i++];
      else
        result[k++] = right[j++];
    }

    while (i < left.length)
      result[k++] = left[i++];

    while (j < right.length)
      result[k++] = right[j++];
  }
}
