package com.BigO;

public class OnSquare {
  public void log(int[] numbers) {

    // O(n * n) -> O(n ^ 2) represents a quadratic growth rate
    for (int first : numbers)   // O(n)
      for (int second : numbers)  // O(n)
        System.out.println(first + ", " + second);


    // O(n + n ^ 2)   -> O(n ^ 2)
    for (int number : numbers)
      System.out.println(number);

    for (int first : numbers)   // O(n)
      for (int second : numbers)  // O(n)
        System.out.println(first + ", " + second);


    // O(n ^ 3)
    for (int first : numbers)   // O(n)
      for (int second : numbers)  // O(n)
        for (int third : numbers)  // O(n)
          System.out.println(first + ", " + second + ", " + third);
  }
}
