import java.util.*;

public class Main {
    public static void main(String[] args) {
      int[] arr={1,2,3,4,5,6};
      System.out.println("Even numbers: ");
      for(int num:arr){
        if(num%2==0){
          System.out.println(num+" ");
        }
      }
      System.out.println("Odd numbers: ");
      for(int num:arr){
        if(num%2!=0){
          System.out.println(num+" ");
        }
      }
  }
}