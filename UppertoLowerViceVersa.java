
// print upper to lower and vice versa
import java.util.*;
public class Main {
    public static void main(String[] args) {
      String str="Dsa123"; //output=dSA123
      StringBuilder res = new StringBuilder();
      for(char ch:str.toCharArray()){
        if(Character.isUpperCase(ch)){
          res.append(Character.toLowerCase(ch));
        }else if(Character.isLowerCase(ch)){
          res.append(Character.toUpperCase(ch));
        }else{
          res.append(ch);
        }
      }
      System.out.println(res);
  }
}