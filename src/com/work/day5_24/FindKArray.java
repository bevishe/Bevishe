package com.work.day5_24;

import org.junit.Test;

/**
 * 给定一个数组, 将起分为k段, 让这k段数组和做大
 * @author wan
 */
public class FindKArray {

	public static int getKArray(int[] arrs, int start, int k) {
		if( start >= arrs.length || k == 0)
			return 0;
		int max = 0;
		int val = arrs[start];
		int currentMax = arrs[start];  // 当前找到第一轮最大值
		int tmp = 0;
		for(int i = start + 1; i < arrs.length; i++) {
			if( val > 0) {
				val += arrs[i];
			} else {
				val = arrs[i];
			}
			if( val > currentMax) {
				currentMax = val;
				tmp = currentMax + getKArray(arrs, i+1, k-1);
				if( tmp > max) {
					max = tmp;
				}
			}
		}
		return max;
	}
	
	@Test
	public void testArray() {
//		int[] nums = {-1, 4, -2, 3, -2, 3};
//		int[] nums = {1,2,3};
		int[] nums = {1,2,-1, 3};
		int result = getKArray(nums, 0, 2);
		System.out.println(result);
	}
	
}
