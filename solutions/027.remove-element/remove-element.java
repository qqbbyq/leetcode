public class Solution {
    public int removeElement(int[] nums, int val) {
        int t = 0;
        for(int n: nums){
            if(n != val) nums[t++] = n;
        }
        return t;
    }
}