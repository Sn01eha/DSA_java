import java.util.*;

public class Main {
    public static void main(String[] args) {
      int first = 0;
      int second = 1;
      int num= 13;
      for(int i=1; i<=num; i++){
        System.out.println(first+" ");
        int next = first + second; //next=1
        first = second; // first=1
        second = next; //second = 1
      }
      
      
  }
}