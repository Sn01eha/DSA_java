import java.util.*;

public class Main {
    public static void main(String[] args) {
      /*  simple method
      int[] arr={10,20,10,5,20,30,5,10};
      int tar = 10;
      int count = 0;
      for(int ele:arr){
        if(ele == tar){
          count++;
        }
      }
      System.out.println(tar+" repeated "+count); */
      
      
      int[] arr={10,20,10,5,20,30,5,10};
      //Map is predefined interface
      // Map interface used to store data in form of a key and value pairs
      
      Map<Integer, Integer> map = new HashMap<>();
      for(int num:arr){
        map.put(num, map.getOrDefault(num,0)+1);
        
      }
      System.out.println(map);
  }
}