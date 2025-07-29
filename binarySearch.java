import java.util.*;

public class Main {
    public static int binary_search(int[] arr, int target){
      int left=0;
      int right=arr.length-1;
      while(left<=right){
        int mid=left+(right-left)/2;
        if(arr[mid]==target){
          return mid;
        }else if(target<arr[mid]){
          right=mid-1;
        }else{
          left=mid+1;
        }
      }
      return -1;
    }
    
    public static void main(String[] args) {
      int[] arr={10,20,30,40,50};
      int target=20;
      int result = binary_search(arr,target);
      if(result!=-1){
        System.out.println("The target element found and is at index: "+ result);
      }else{
        System.out.println("Element not found!");
      }
      
  }
}