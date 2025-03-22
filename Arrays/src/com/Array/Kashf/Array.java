package com.Array.Kashf;

public class Array {
  private int[] items;
  private int count;

  public Array(int length) {
    items = new int[length];
  }

  public void insert(int item) {
    resizeIfRequired();
    // Add the new item at the end
    items[count++] = item;
  }

   public void insertAt(int item, int index) {
     if (index < 0 || index > count)
       throw new IllegalArgumentException();

     // Note that I've extracted the logic for
     // resizing the array into this private
     // method so we can reuse in insert() and
     // insertAt() methods.
     //
     // This also made our code cleaner and
     // more readable.
     resizeIfRequired();

     for (int i = count - 1; i >= index; i--)
       items[i + 1] = items[i];

     items[index] = item;
     count++;
   }

  private void resizeIfRequired() {
    if (items.length == count) {
      int[] newItems = new int[count * 2];

      for (int i = 0; i < count; i++)
        newItems[i] = items[i];

      items = newItems;
    }
  }

  public void reverse() {
    int[] newItems = new int[count];

    for (int i = 0; i < count; i++)
      newItems[i] = items[count - i - 1];

    items = newItems;
  }

  public int max() {
    // O(n): Because we have to iterate over
    // the entire array to find the largest
    // number. This number may be at the end
    // of the array (worst case scenario).
    int max = 0;
    for (int item : items)
      if (item > max)
        max = item;

    return max;
  }

  public Array intersect(Array other) {
    var intersection = new Array(count);

    for (int item : items)
      if (other.indexOf(item) >= 0)
        intersection.insert(item);

    return intersection;
  }

  public void removeAt(int index) {
    // Validate the index
    if (index < 0 || index >= count)
      throw new IllegalArgumentException();

    // Shift the items to the left to fill the hole
    // [10, 20, 30, 40] -> [10, 30, 40]
    // index: 1
    // 1 <- 2
    // 2 <- 3
    for (int i = index; i < count; i++)
      items[i] = items[i + 1];

    count--;
  }

  public int indexOf(int item) { // Best Case: O(1), Worst Case: O(n)
    // If we find it, return index
    // Otherwise, return -1
    for (int i = 0; i < count; i++)
      if (items[i] == item)
        return i;

    return -1;
  }

  public void print() {
    for (int i = 0; i < count; i++)
//    for (int i = 0; i < items.length; i++)
      System.out.println(items[i]);
  }
}
