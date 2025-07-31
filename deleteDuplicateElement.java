import java.util.*;

public class Main {
    public static void main(String[] args) {
      int[] arr={10,20,30,10,20,50,40};
      Set set = new LinkedHashSet();
      for(int ele:arr){
        set.add(ele);
      }
      System.out.println(set);
  }
}