package 数组;

import java.util.Arrays;

public class _217_存在重复元素 {
    class Solution {
        public boolean containsDuplicate(int[] nums) {
            //Java库中的排序
            Arrays.sort(nums);
            //先算出要最后一个元素的下标(小优化)
            int n = nums.length - 1;
            for (int i = 0; i < n; i++) {
                if (nums[i] == nums[i + 1]) {
                    return true;
                }
            }
            return false;
        }
    }
}
