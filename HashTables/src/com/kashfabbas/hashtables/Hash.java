package com.kashfabbas.hashtables;

import java.util.HashMap;
import java.util.Map;

public class Hash {
  public static void main(String[] args) {
//    Map<Integer, String> map = new HashMap<>();
    Map<String, String> map = new HashMap<>();
//    map.put(123456, "Kashf");
    map.put("123455-A", "Kashf");
    // items[1] = "Kashf"
    // 100
    // 0 - 99
//    System.out.println(hash(123456));
    System.out.println(hash("123455-A"));   // 18

    String str = "orange";
    System.out.println(str.hashCode());   // -1008851410
  }
//  public static int hash(int number) {
//    return number % 100;
//  }
  public static int hash(String key) {
    int hash = 0;
    for (var ch : key.toCharArray())
      hash += ch;
    return hash % 100;
  }
}
