public class Solution {
    public int[] plusOne(int[] digits) {
        int remain = 1;
        int sum = 0;
        for(int i = digits.length - 1; i>=0; i--){
            if(digits[i]!= 9){
                digits[i] += remain;
                remain = 0;
                break;
            }
            sum = digits[i] + remain;
            remain = sum / 10;
            digits[i] = sum % 10;
        }
        if(remain != 0){
            int[] newNum = new int[digits.length + 1];
            newNum[0] = remain;
            for(int i = 0; i< digits.length; ++i)
                newNum[i + 1] = digits[i];
            return newNum;
            
        }
        return digits;
        
        
    }
}