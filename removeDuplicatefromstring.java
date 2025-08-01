import java.util.*;

public class Main {
    public static void main(String[] args) {
      String str = "Hello"; //Hello
      char[] arr = str.toCharArray();
      //append non repeated character
      StringBuilder result = new StringBuilder();
      //boolean array
      boolean[] check = new boolean[256];
      for(char ch:arr){
        if(!check[ch]){
          result.append(ch);
          check[ch]=true;
        }
      }
      System.out.println("Result is "+result.toString());
  }
}