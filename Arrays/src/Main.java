import com.Array.Kashf.Array;

public class Main {
  public static void main(String[] args) {
    Array numbers = new Array(3);

    numbers.insert(10);
    numbers.insert(20);
    numbers.insert(30);
    numbers.insertAt(40, 3);
    numbers.print();
  }
}