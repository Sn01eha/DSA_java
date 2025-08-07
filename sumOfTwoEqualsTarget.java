
// finding sum of two numbers which would give us the target
import java.util.*;
public class Main {
    public static void main(String[] args) {
      int[] arr={2,7,11,15};
      int target=13;
      for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
          if(arr[i]+arr[j]==target){
            System.out.print("Pair :"+i+","+j);
          }
        }
      }
  }
}