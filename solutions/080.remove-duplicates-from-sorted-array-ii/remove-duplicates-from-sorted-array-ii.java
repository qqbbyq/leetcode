public class Solution {
    public int removeDuplicates(int[] nums) {
        int t = 2;
        
        for(int i = 1; i< nums.length - 1; ++i){
            if(nums[i] != nums[i + 1]){
                nums[t ++] = nums[i+1];
            } else if(nums[i + 1] != nums[t - 2]){
                nums[t ++] = nums[i + 1];
            }
        }
        
        
        return t;
  }
    
}