//check whether a given string is palindrome or not

import java.util.*;

public class Main {
  
  public static Boolean isPalindrome(String str, int start, int end){
    if(start>=end){
      return true;
    }
    if(str.charAt(start)!= str.charAt(end)){
      return false;
    }
    return isPalindrome(str, start+1,end-1);
    
  }
  
    public static void main(String[] args) {
      String word="madam";
      boolean flag= isPalindrome(word, 0, word.length()-1);
      if(flag){
        System.out.println("Palindrome");
      }else{
        System.out.println("Not Palindrome");
      }
      
      
      }
  }
