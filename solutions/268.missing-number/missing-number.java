public class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int n: nums) sum +=n;
        int len = nums.length;
        return (0 + len)*(len + 1)/2 - sum;
    }
}