import java.util.*;

public class Main {
    public static void main(String[] args) {
      int[] arr={10,5,20,15,30,45};
      int min= arr[0];
      for(int ele:arr){
        if(ele < min){
          min = ele;
        }
      }
      
      System.out.println("min ele is :"+ min);
  }
}