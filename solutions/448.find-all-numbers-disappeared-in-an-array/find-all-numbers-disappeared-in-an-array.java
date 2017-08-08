public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        
        int len =  nums.length;
        for (int i=0; i< len; i++) nums[(nums[i] % len == 0 ? len : nums[i] % len) -1] += len;
        for (int i=0; i< len; i++) if(nums[i] <= len ) list.add(i+1);
        return list;
    }
}