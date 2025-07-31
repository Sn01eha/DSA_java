import java.util.*;

public class Main {
    public static void main(String[] args) {
      int[] arr={10,20,30,40,50};
      int target = 30;
      boolean flag=false;
      for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
          flag=true;
          break;
        }
          
        
      }
      System.out.println(flag ? "Search success" : "Search not success");
  }
}