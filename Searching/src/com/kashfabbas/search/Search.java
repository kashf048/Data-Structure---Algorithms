package com.kashfabbas.search;

public class Search {
  public int linearSearch(int[] array, int target) {
    //                    BEST    WORST
    // ---------------------------------
    // Time Complexity    O(1)    O(n)

    for (var i = 0; i < array.length; i++)
      if (array[i] == target)
        return i;

    return -1;
  }

  public int binarySearchRec(int[] array, int target) {
    return binarySearchRec(array, target, 0, array.length - 1);
  }

  private int binarySearchRec(int[] array, int target, int left, int right) {
    if (right < left)
      return -1;

    var middle = (left + right) / 2;

    if (array[middle] == target)
      return middle;

    if (target < array[middle])
      return binarySearchRec(array, target, left, middle - 1);

    return binarySearchRec(array, target, middle + 1, right);
  }

  public int binarySearch(int[] array, int target) {
    //  Time Complexity     O(log n)
    // Space Complexity     O(log n)      O(1)
    //                      Recursive     Iterative

    // target == mid
    // target > mid
    // target < mid

    var left = 0;
    var right = array.length - 1;

    while (left <= right) {
      var middle = (left + right) / 2;

      if (array[middle] == target)
        return middle;

      if (target < array[middle])
        right = middle - 1;
      else
        left = middle + 1;
    }

    return -1;
  }

  public int ternarySearch(int[] array, int target) {
    return ternarySearch(array, target, 0, array.length - 1);
  }

  private int ternarySearch(int[] array, int target, int left, int right) {
    // Time Complexity: O(log base 3 n)

    // Binary search is faster than ternary search

    // target > mid2
    // target == mid2
    // target < mid2 && target > mid1
    // target == mid1
    // target < mid1

    if (left > right)
      return -1;

    int partitionSize = (right - left) / 3;
    int mid1 = left + partitionSize;
    int mid2 = right - partitionSize;

    if (array[mid1] == target)
      return mid1;

    if (array[mid2] == target)
      return mid2;

    if (target < array[mid1])
      return ternarySearch(array, target, left, mid1 - 1);

    if (target > array[mid2])
      return ternarySearch(array, target, mid2 + 1, right);

    return ternarySearch(array, target, mid1 + 1, mid2 - 1);
  }

  public int jumpSearch(int[] array, int target) {
    // Time Complexity: O(sqrt n)

    int blockSize = (int) Math.sqrt(array.length);
    int start = 0;
    int next = blockSize;

    while (start < array.length &&
            array[next - 1] < target) {
      start = next;
      next += blockSize;
      if (next > array.length)
        next = array.length;
    }

    for (var i = 0; i < next; i++)
      if (array[i] == target)
        return i;

    return -1;
  }

  public int exponentialSearch(int[] array, int target) {
    // Time Complexity: O(log i)

    int bound = 1;
    while (bound < array.length && array[bound] < target)
      bound *= 2;

    int left = bound / 2;
    int right = Math.min(bound, array.length - 1);

    return binarySearchRec(array, target, left, right);
  }
}
