package com.Array.Kashf;

import java.util.ArrayList;

public class DynamicArray {
  public static void main(String[] args) {
    // Vector: 100% - Synchronization
    // ArrayList 50%

    ArrayList<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(20);
    list.add(30);
//    list.remove(1);
//    list.lastIndexOf(200);
//    list.size();
    list.toArray(); // Regular array object
    System.out.println(list);
  }
}
