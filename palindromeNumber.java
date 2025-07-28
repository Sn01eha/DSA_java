import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Enter number:");
      Scanner scanner = new Scanner(System.in);
      int num = scanner.nextInt();
      
      int original= num;
      int rev=0;
      
      while(num!=0){
        int last_digit = num%10; //% means we get last digit
        rev=rev*10 + last_digit;
        num= num/10; // / is used to delete last digit
      }
      
      if(original == rev){
        System.out.println("Palindrome");
      }else{
        System.out.println("not palindrome");
      }
  }
}