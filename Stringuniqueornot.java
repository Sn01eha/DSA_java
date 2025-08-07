import java.util.*;

public class Main {
    public static void main(String[] args) {
      String str = "abcd";
      //find number of characters
      int n = str.length();
      System.out.println(n);
      boolean flag=false;
      //compare side by side characters
      for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
          if(str.charAt(i)==str.charAt(j)){
            flag=true;
            break;
          }
        }
      }
      System.out.println( !flag ? "unique string!!":" not unique string");
  }
}