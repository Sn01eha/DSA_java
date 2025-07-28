import java.util.*;

public class Main {
    public static void main(String[] args) {
      int num = 153;
      int num_digits = String.valueOf(num).length(); //prints number of digits present in number
      int original = num;
      int sum=0;
      while(num!=0){
        int last_digit = num%10;
        sum += Math.pow(last_digit, num_digits); // 153 = 1^3 + 5^3 + 3^3 this is armstrong number
        num = num/10;
      }
      if(sum == original){
        System.out.println("Armstrong number");
      }else{
        System.out.println("Not Armstrong number");
      }
      
      
      
  }
}