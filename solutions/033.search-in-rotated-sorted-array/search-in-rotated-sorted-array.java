public class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;
        int middle ;
        while(start <= end){
            middle = (start + end)/2;
            if(nums[middle] == target) return middle;
            if(nums[middle] >= nums[start]){
                if(target >= nums[start] && target <= nums[middle]){
                    end = middle;
                } else {
                    start = middle +1;
                }
            } else {
                if(target >= nums[middle] && target <= nums[end]){
                    start = middle +1;
                } else {
                    end = middle;
                }
            }
        }
        return -1;
    }
}