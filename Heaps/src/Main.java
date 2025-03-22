import com.kashfabbas.heap.Heap;
import com.kashfabbas.heap.MaxHeap;
import com.kashfabbas.heap.MinHeap;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
//    var heap = new Heap();
//    heap.insert(10);
//    heap.insert(5);
//    heap.insert(17);
//    heap.insert(4);
//    heap.insert(22);
//    heap.remove();
//    System.out.println("Done");

    int[] numbers = { 5, 3, 8, 4, 1, 2 };
    MaxHeap.heapify(numbers);
    System.out.println(Arrays.toString(numbers));

    // GetKthLarger
    // K = 1    -> 1st largest element 8
    // K = 2    -> 2st largest element 5
    System.out.println(MaxHeap.getKthLargest(numbers, 3));
  }
}