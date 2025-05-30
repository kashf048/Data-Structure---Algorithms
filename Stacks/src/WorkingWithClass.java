import java.util.Stack;

public class WorkingWithClass {
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    stack.push(10);   // CTRL + D duplicate line
    stack.push(20);
    stack.push(30);
    System.out.println(stack);
    var top = stack.pop();
    System.out.println(top);
    System.out.println(stack);
    top = stack.peek();
    System.out.println(top);
    stack.search(20);   // search is never use
  }
}
