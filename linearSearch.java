import java.util.*;

public class Main {
    public static int linear_search(int[] arr, int target){
      for(int i = 0; i<arr.length;i++){
        if(arr[i]==target){
          return i;
        }
      }
      return -1;
    }
    
    
    public static void main(String[] args) {
      int[] arr={10,20,30,40,50};
      int target= 50;
      int result = linear_search(arr,target);
      if(result==-1){
        System.out.println("search not success. element not found");
      }else{
        System.out.println("element found at index: "+result);
      }
  }
}