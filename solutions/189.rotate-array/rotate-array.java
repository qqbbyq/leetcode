public class Solution {
    public void rotate(int[] nums, int k) {
         int n = nums.length;
        k = k %n;
        int [] rs = new int[n-k];
       
        for(int i=0; i<n-k; i++ ) rs[i] = nums[i];
        for(int i=0; i<n; ++i){
            if (i < k) {
                nums[i] = nums[i+n-k];
            } else {
                nums[i] = rs[i-k];
            }
        }
        
    }
}