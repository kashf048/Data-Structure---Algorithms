import com.kashfabbas.sort.*;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] numbers = { 7, 3, 1, 5, 2 , 3, 2, 11, 4 };
//    var sorter = new BubbleSort();
//    var sorter = new SelectionSort();
//    var sorter = new InsertionSort();
//    var sorter = new MergeSort();
//    sorter.sort(numbers);
//    var sorter = new QuickSort();
//    var sorter = new CountingSort();
    var sorter = new BucketSort();
    sorter.sort(numbers, 4);  // Number of bucket 4
    System.out.println(Arrays.toString(numbers));
  }
}