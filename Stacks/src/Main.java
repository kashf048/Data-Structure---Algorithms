import com.kashfabbas.stack.*;

public class Main {
  public static void main(String[] args) {
    String str = "abcdefghijklmnopqrstuvwxyz";

    StringReverser reverser = new StringReverser();
    var result = reverser.reverse(str);
    System.out.println(result);

    // Expression
    // Edge cases
    // (
    // (()
    // ( ]
    // ) (
    String str2 = "((<1> + [2]))[a](";
    Expression exp = new Expression();
    var result2 = exp.isBalanced(str2);
    System.out.println(result2);

    // Stack
    // [10, 20, 0, 0, 0]
    //      ^
    // count = 1
    // push(20)
    // array[count] = 20
    Stack stack = new Stack();
    stack.push(10);
    stack.push(20);
    stack.push(30);
    System.out.println(stack.peek());
    var empty = stack.isEmpty();
    System.out.println(empty);

    var twoStack = new TwoStacks(10);
    twoStack.push1(40);
    twoStack.push2(50);
    twoStack.push1(60);
    twoStack.push2(70);
    twoStack.push1(80);
    twoStack.push2(90);

    System.out.println(twoStack);

    System.out.println("Popped from stack1: " + twoStack.pop1());
    System.out.println("Popped from stack2: " + twoStack.pop2());

    System.out.println(twoStack);

    // MinStack
    MinStack ms = new MinStack();
    ms.push(40);
    ms.push(30);
    ms.push(20);
    ms.push(10);
    System.out.println(ms.min());

    ms.pop();
    System.out.println(ms.min());

  }
}