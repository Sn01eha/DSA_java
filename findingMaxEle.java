import java.util.*;

public class Main {
    public static void main(String[] args) {
      int[] arr={10,5,20,15,30,45};
      int max= arr[0];
      for(int ele:arr){
        if(ele > max){
          max = ele;
        }
      }
      
      System.out.println("max ele is :"+ max);
  }
}