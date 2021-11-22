package 数组;

import java.util.ArrayList;
import java.util.Arrays;

public class _350_两个数组的交集ll {
	class Solution {
		public int[] intersect(int[] nums1, int[] nums2) {
			//先排序
			Arrays.sort(nums1);
			Arrays.sort(nums2);

			//定义一个动态数组
			ArrayList<Integer> results = new ArrayList<>();
			//数组1,2的索引
			int index1 = 0, index2 = 0;
			int len1 = nums1.length;
			int len2 = nums2.length;
			//当其中一个数组越界了，退出循环
			while (index1 < len1 && index2 < len2) {
				if (nums1[index1] < nums2[index2]) { //如果数组1的值小于数组2的值，就数组1自加，因为数组都是排好序的，找相同值
					index1++;
				} else if (nums1[index1] > nums2[index2]) {  //同上
					index2++;
				} else {    //值相同，就找到交集了，先把值赋给动态数组，然后两个数组都自加
					results.add(nums1[index1]);
					index1++;
					index2++;

				}
			}
			//把动态数组强制转换成int型数组
			int[] res = results.stream().mapToInt(i -> i).toArray();
			return res;
		}


	}
}
