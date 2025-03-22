import com.kashfabbas.search.Search;

public class Main {
  public static void main(String[] args) {
    int[] numbers = { 4, 2, 1, 5, 10, 7 };
    int[] numbers2 = { 2, 4, 5, 7, 10, 14 };
    var search = new Search();
//    var index = search.linearSearch(numbers, 1);
//    var index = search.binarySearchRec(numbers2, 11); // array is sorted
//    var index = search.binarySearch(numbers2, 5); // array is sorted
//    var index = search.binarySearch(numbers2, 14); // array is sorted
//    var index = search.binarySearch(numbers2, 5); // array is sorted
    var index = search.exponentialSearch(numbers2, 10); // array is sorted
    System.out.println("Index of: " + index);

  }
}