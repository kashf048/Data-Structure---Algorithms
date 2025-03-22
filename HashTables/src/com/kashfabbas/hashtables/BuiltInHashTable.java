package com.kashfabbas.hashtables;

import java.util.HashMap;
import java.util.Map;

public class BuiltInHashTable {
  public static void main(String[] args) {
    // https://docs.oracle.com/javase/8/docs/api/java/util/Hashtable.html
    // Key: Employee Number (Integer)
    // Value: Name (String)
    Map<Integer, String> map = new HashMap<>();
    map.put(1, "Kashf");
    map.put(2, "Mansoor");
    map.put(3, "Abeeha");
    map.put(3, "Ali Jee");
    map.put(4, null);
    map.put(null, null);
    map.remove(null);
    map.remove(3, "Ali Jee");
    var value = map.get(2);
    System.out.println(value);
    System.out.println(map.containsKey(5));                       // O(1)
    System.out.println(map.containsValue("Ali Jee"));             // O(n)
    System.out.println(map);

    for (var item : map.entrySet())   // keySet only pass key
      System.out.println(item);  //  item.getValue pass by value, hashCode() pass by hashCode
  }
}
