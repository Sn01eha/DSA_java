import java.util.*;

public class Main {
    public static void main(String[] args) {
      int num1 = 200;
      int num2 = 100;
      System.out.println("before swapping num 1="+ num1 + " num2 ="+num2);
      num1 = num1 + num2; //200+100=300
      num2 = num1 - num2;// 300-100 = 200
      num1 = num1 - num2;// 300- 200 = 100
      System.out.println("After swapping num 1="+ num1 + " num2 ="+num2);
      
  }
}