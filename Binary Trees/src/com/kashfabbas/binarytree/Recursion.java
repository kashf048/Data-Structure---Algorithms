package com.kashfabbas.binarytree;

public class Recursion {
  public static void main(String[] args) {
    // 4! = 4 x 3 x 2 x 1
    // 3! = 3 x 2 x 1
    System.out.println(factorial(4));

    System.out.println(factorial2(3));
  }
  public static int factorial(int n) {
    var factorial = 1;
    for (int i = n; i > 1; i--)
      factorial *= i;
    return factorial;
  }

  // f(3)     -> 6
  //   3 x f(2)     -> 3 x 2
  //         2 x f(1)     -> 2 x 1
  //               1 x f(0)   -> 1 x 1
  public static int factorial2(int n) {
    if (n == 0) // Base condition termination the condition
      return 1;
    return n * factorial2(n - 1);
  }
}
