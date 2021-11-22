package 数组;

public class _53_最大子序和 {
    //贪心算法
    class Solution {
        public int maxSubArray(int[] nums) {
            //最大下标
            int n = nums.length - 1;
            //初始化sum，max，max默认为第一个数
            int sum = 0;
            int max = nums[0];
            //如果数组只有一个元素，直接返回
            if (nums.length == 1) return nums[0];
            for (int i = 0; i <= n; i++) {
                //和
                sum = sum + nums[i];
                //如果最大值小于和，就赋值给max
                //这样即便数组全为负数，也会记录下最大值，而不会赋为0
                if (max < sum) max = sum;
                //如果和小于0.就将和初始化为0
                if (sum < 0) sum = 0;
            }
            //返回最大值
            return max;
        }
    }
}
