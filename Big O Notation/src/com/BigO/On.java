package com.BigO;

public class On {
  public void log(int[] numbers, String[] names) {
  // O(n) n represent numbers of inputs O(2 + n) constant is ignore = O(n) is Linear
    System.out.println(); // O(1)
    for (int i = 0; i < numbers.length; i++)  // O(n)
      System.out.println(numbers[i]);
    System.out.println(); // O(1)

    // O(n + n) -> O(2n) -> O(n)
    for (int number : numbers)  // O(n)
      System.out.println(number);

    for (int number : numbers)
      System.out.println(number); // O(n)

    // O(n + m) -> O(n)
    for (int number : numbers)
      System.out.println(number); // O(n)

    for (String name : names)
      System.out.println(name); // O(m)
  }
}
