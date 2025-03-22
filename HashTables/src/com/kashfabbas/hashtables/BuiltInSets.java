package com.kashfabbas.hashtables;

import java.util.HashSet;
import java.util.Set;

public class BuiltInSets {
  public static void main(String[] args) {
    // Maps: k -> v
  // Sets: k
  // [1, 2, 3, 3, 2, 1, 4, 5]
  Set<Integer> set = new HashSet<>();
  int[] numbers = { 1, 2, 3, 3, 2, 1, 4, 5 };
  for (var number : numbers)
    set.add(number);
    System.out.println(set);
  }
}
