import java.util.*;

public class Main {
    public static void main(String[] args) {
      //queue - FIFO
      //predefined methods
      Queue<Integer> queue = new LinkedList<>();
      //add element to queue
      queue.add(10); //if queue is full, it will throw error
      queue.add(20);
      queue.add(30);
      queue.add(40);
      queue.add(50);
      queue.offer(60);// will not throw error if queue is full
      System.out.println(queue);
      
      //read top element without removing(peek)
      int top_element = queue.peek();
      System.out.println(top_element);
      System.out.println(queue);
      
      //remove element
      int remove_element= queue.remove();
      System.out.println(remove_element);
      System.out.println(queue);
      
      //check if empty or not 
      boolean flag = queue.isEmpty();
      System.out.println(flag);
      
      //find numer of elements
      int number_of_elements = queue.size();
      System.out.println(number_of_elements);
      
      System.out.println(queue.poll());
  }
}