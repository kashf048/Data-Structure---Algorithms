package com.kashfabbas.hashtables;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CharFinder {
  // a green apple
  // a=2
  //  =2
  // g=1
  public char findFirstNonRepeatingChar(String str) {
    Map<Character, Integer> map = new HashMap<>();
    var chars = str.toCharArray();
    for (var ch : chars) {
//      if (map.containsKey(ch)) {
//        var count = map.get(ch);
//        map.put(ch, count);
//      } else
//        map.put(ch, 1);

      var count = map.containsKey(ch) ? map.get(ch) : 0;  // 2 in 1 logic
      map.put(ch, count + 1);
    }
//    System.out.println(map);
    for (var ch : chars)
      if (map.get(ch) == 1)
        return ch;

    return Character.MIN_VALUE;
  }

  public char findFirstRepeatedChar(String str) {
    Set<Character> set = new HashSet<>();

    for (var ch : str.toCharArray()) {
      if (set.contains(ch))
        return ch;

      set.add(ch);
    }
    System.out.println(set);
    return Character.MIN_VALUE;
  }
}
