public class Solution {
  
  public int myAtoi(String str) {
    if(str == null || str.length() == 0) return 0;
    str = str.trim();
    int sign = 1, start = 1;

    long sum = 0;
    if(str.charAt(0) == '-') sign = -1;
    else if(str.charAt(0) == '+') sign = 1;
    else start = 0;

    for(int i = start; i < str.length() ; i ++){
      if(!Character.isDigit(str.charAt(i))){
        return (int)sum * sign;
      }
      sum =  sum * 10 + (str.charAt(i) - '0');
      if(sum * sign> Integer.MAX_VALUE){
        return (int)Integer.MAX_VALUE;
      }
      if(sum * sign < Integer.MIN_VALUE){
        return Integer.MIN_VALUE;
      }
    }
    return (int)sum* sign;


  }
}