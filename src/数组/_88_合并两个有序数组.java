package 数组;

import java.util.Arrays;

public class _88_合并两个有序数组 {
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            //将数组num2放进数组num1的尾部，然后将整个数组排序
            for (int j = 0; j < n; j++) {
                nums1[m] = nums2[j];
                m++;
            }
            Arrays.sort(nums1);
        }
    }
}
