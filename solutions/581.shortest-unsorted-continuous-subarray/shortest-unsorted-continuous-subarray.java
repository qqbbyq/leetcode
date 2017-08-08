public class Solution {
    public int findUnsortedSubarray(int[] nums) {
        if(nums.length == 1) return 0;
        int low = 0, high = nums.length - 1;
        
        while(low + 1 < nums.length && nums[low] <= nums[low + 1]){
            low ++;
        }
        while(high > 0 && nums[high] >= nums[high -1]){
            high --;
        }
        //0-i alreday asending sort
        //j-nums.length-1 alreday asending sort
        if(low >= high) return 0;
        int index1 = low;
        int index2 = high;
        for(int i = low; i <= high; i ++){
            if(nums[i] < nums[index1]){
                index1 = i;
            } else if(nums[i] > nums[index2]){
                index2 = i;
            }
        }
        while(low >=0 && nums[low] > nums[index1]){
            low --;
        }
        while(high < nums.length && nums[high] < nums[index2]){
            high ++;
        }
        return (high -1) - (low + 1) + 1;
    }
}