public class Solution {
    
    public void sortColors(int[] nums) {
        int N = nums.length - 1;
        for(int i = nums.length/2 - 1; i >= 0; --i){
            sink(nums, i, N);
        }
        // for(int n: nums) System.out.println(n);
        
        while(N > 0){
            // System.out.println("N=" + N + "******************");
            swap(nums, 0, N --);
            // for(int n: nums) System.out.println(n);
            // System.out.println("******************");
            sink(nums, 0, N);
            // for(int n: nums) System.out.println(n);
        }
    }
    
    
    public void sink(int[] nums, int k, int N){
        int j;
        while(2*k < N){
            j = 2*k + 1;
            if(j < N && nums[j+1] > nums[j]){
                j++;
            }
            if(nums[k] >= nums[j]) break;
            swap(nums, j,k);
            k = j;
        }
    }
    
    public void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    
}