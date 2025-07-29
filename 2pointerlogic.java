import java.util.*;

public class Main {
    public static void main(String[] args) {
      int[] arr={10,19,18,17,16};
      int start = 0;
      int end = arr.length -1;
      System.out.println(start);
      System.out.println(end);
      
      while(start< end){
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
      }
      System.out.println(Arrays.toString(arr));
  }
}