package com.kashfabbas.stack;

// We need two stacks to implement a min stack.
// One stack holds the values, the other stack
// (called minStack) holds the minimums.
public class MinStack {
  private Stack stack = new Stack();
  private Stack minStack = new Stack();

  public void push(int item) {  // O(1)
    stack.push(item);

    if (minStack.isEmpty())
      minStack.push(item);
    else if (item < minStack.peek())
      minStack.push(item);
  }

  public int pop() {    // O(1)
    if (stack.isEmpty())
      throw new IllegalStateException();

    var top = stack.pop();

    if (minStack.peek() == top)
      minStack.pop();

    return top;
  }

  public int min() {    // O(1)
    return minStack.peek();
  }
}
