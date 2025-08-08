import java.util.*;

public class Main {
    public static void main(String[] args) {
      MyQueue queue = new MyQueue(5);
      queue.enqueue(10);
      queue.enqueue(20);
      queue.enqueue(30);
      queue.enqueue(40);
      queue.enqueue(50);
      queue.enqueue(60);
      // queue.dequeue();
      //queue.dequeue();
      //queue.dequeue();
      //queue.dequeue();
      //queue.dequeue();
      //queue.dequeue(); 
      
      System.out.println(queue.isempty());
      System.out.println(queue.isFull());
      System.out.println(queue.size());
      queue.display();
      
      
  }
}

class MyQueue{
  private int size;
  private int front;
  private int rear;
  private int[] queue;
  
  //constructor to initialze 
  public MyQueue(int capacity){
    size = capacity;
    queue = new int[size];
    front = 0;
    rear =0;
  }
  
  //enqueue
  public void enqueue(int data){
    if(rear==size){
      System.out.println("Queue is full");
    }else{
      queue[rear]=data;
      rear++;
      System.out.println("Element added to queue "+data);
    }
  }
  
  //dequeue
  public void dequeue(){
    if(front == rear){
      System.out.println("Queue is empty");
    }else{
      int removed_element = queue[front];
      System.out.println("Element deleted to queue "+removed_element);
      front++;
      
    }
  }
  //isEmpty
  public boolean isempty(){
    return front == rear;
  }
  //check if full
  public boolean isFull(){
    return rear == size;
  }
  //check capacity
  public int size(){
    return size;
  }
  //display
  public void display(){
    for(int i=front; i<rear;i++){
      System.out.println(queue[i]);
    }
  }
}