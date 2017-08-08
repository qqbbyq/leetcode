public class Solution {
    public static int findMaxConsecutiveOnes(int[] nums) {
    int max = 0;
    int step = 0;
    for (int num : nums) {
      if (num == 0) {
        step = 0;
      } else {
        step = step + 1;
        max = Math.max(max, step);
      }
    }
    return max;
  }
  
}