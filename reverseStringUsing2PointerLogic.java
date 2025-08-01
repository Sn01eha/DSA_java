import java.util.*;
// reversing using 2 pointer logic
public class Main {
    public static void main(String[] args) {
      String str = "Hello";
      //Hello --> ['H','e','l','l','o']
      // toCharArray()  used to convert string to character array
      char[] arr = str.toCharArray();
      
      int start = 0;
      int end = arr.length - 1;
      while(start <= end){
        char temp = arr[start];
        arr[start]= arr[end];
        arr[end]=temp;
        start++;
        end--;
      }
      String rev = new String(arr);
      System.out.println(rev);
  }
}