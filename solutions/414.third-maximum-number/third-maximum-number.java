public class Solution {
    public int thirdMax(int[] nums) {
        Integer max = null;
        Integer second_max = null;
        Integer third_max = null;
        
        for(Integer n: nums){
            
            if( n.equals(max) || n.equals(second_max) || n.equals(third_max)) continue;
            
            if(max == null || n > max) {
                third_max = second_max;
                second_max = max;
                max = n;
            }
            else if( second_max == null || n > second_max){
                third_max = second_max;
                second_max = n;
            }
            else if( third_max == null || n > third_max ){
                third_max = n;
            }
        }
        return third_max !=null ? third_max : max;
    }
}