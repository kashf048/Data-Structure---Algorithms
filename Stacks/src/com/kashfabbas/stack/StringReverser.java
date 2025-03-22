package com.kashfabbas.stack;

public class StringReverser {
  public String reverse(String input) {
    java.util.Stack<Character> stack = new java.util.Stack<>();

    if (stack == null)
      throw new IllegalArgumentException();

  //    for (int i = 0; i < input.length(); i++)  // 2 in 1 but is difficult
  //      stack.push(input.charAt(i));

    for (char ch : input.toCharArray()) // beautiful
      stack.push(ch);

    StringBuffer reversed = new StringBuffer();
    while (!stack.empty())
      reversed.append(stack.pop());

    return reversed.toString();
  }
}
