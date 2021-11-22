package 数组;

public class _1_两数之和 {
    class Solution {
        //暴力枚举
        public int[] twoSum(int[] nums, int target) {
            int n = nums.length - 1;
            int[] tmp = new int[2];
            for (int i = 0; i <= n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    if (nums[i] + nums[j] == target) {
                        tmp[0] = i;
                        tmp[1] = j;
                    }
                }
            }
            return tmp;
        }
    }
}