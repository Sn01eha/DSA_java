import java.util.*;

public class Main {
    public static void main(String[] args) {
      String str="hello";
      char[] charArray=str.toCharArray();;
      int start = 0;
      int end = str.length()-1;
      System.out.println(start);
      System.out.println(end);
      
      while(start< end){
        char temp = charArray[start];
        charArray[start]=charArray[end];
        charArray[end]=temp;
        start++;
        end--;
      }
      System.out.println("Reversed string:"+ new String(charArray));
  }
}