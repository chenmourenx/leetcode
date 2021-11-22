package 数组;

public class _121_买卖股票的最佳时机 {
    //暴力破解(超出时间限制)
//	class Solution {
//	    public int maxProfit(int[] prices) {
//	        int max=0,int tmp=0;
//	        int len=prices.length;
//	        for (int i = 0; i < len-1; i++) {
//				for (int j =i+1 ; j < len; j++) {
//					tmp=prices[j]-prices[i];
//					if (max<=tmp) {
//						max=tmp;
//					}
//				}
//			}
//	        return max;
//	    }
//	}

    //一次遍历
    public int maxProfit(int[] prices) {
        int max = 0;
        //Integer.MIN_VALUE为整数最大值，即2147483648
        int min = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < min) { //循环中保持min一直为最小值
                min = price;
            } else if (max <= (price - min)) { //min为之前的最小值，用当前值减去最小值，即为最大值，保持max为遍历时的最大值
                max = price - min;
            }
        }
        return max;
    }

}



