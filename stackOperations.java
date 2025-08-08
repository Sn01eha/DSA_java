import java.util.*;
// stack operations
public class Main {
    public static void main(String[] args) {
      // Stack creation readymade method
      Stack<Integer> stack = new Stack<>();
      //push()
      stack.push(10);
      stack.push(20);
      stack.push(30);
      stack.push(40);
      System.out.println(stack);
      //peek- see top element
      int top_element = stack.peek();
      System.out.println(top_element);
      System.out.println(stack);
      //delete top element
      int top = stack.pop();
      System.out.println(top);
      System.out.println(stack);
      //search element
      int search= stack.search(30);
      System.out.println(search);
      //empty or  not
      boolean flag = stack.isEmpty();
      System.out.println(flag);
      //size of stack
      int total_elements = stack.size();
      System.out.println(total_elements);
      
  }
}