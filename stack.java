import java.util.*;

public class Main {
    public static void main(String[] args) {
      MyStack stack = new MyStack(5);
      stack.push(10);
      stack.push(20);
      stack.push(30);
      stack.push(40);
      stack.push(50);
      stack.push(60);
      
      /* stack.pop();
      stack.pop();
      stack.pop();
      stack.pop();
      stack.pop();
      stack.pop(); */
      int top = stack.peek();
      System.out.println(top);
      
      boolean flag = stack.isEmpty();
      System.out.println(flag);
  }
}
class MyStack{
  //instance variables
  private int maxSize;
  private int[] stackArray;
  private int top;
  
  //constructor used to initialize instance variables
  public MyStack(int size){
    maxSize = size;
    stackArray = new int[maxSize];
    top=-1;
  }
  
  //push operation
  public void push(int value){
    if(top == maxSize-1){
      System.out.println("Stack full");
    }else{
      stackArray[++top]=value;
      System.out.println("Elemet added to stack "+value);
    }
  }
  
  //check empty or not
  public boolean isEmpty(){
    return top==-1;
  }
  
  //pop operation
  public void pop(){
    if(top==-1){
      System.out.println("Stack empty");
    }else{
      System.out.println("Element removed successfully "+stackArray[top--]);
    }
  }
  //peek operation
  public int peek(){
    if(top == -1){
      System.out.println("Stack empty");
      return -1;
    }else{
      return stackArray[top];
    }
  }
  
  
  
}