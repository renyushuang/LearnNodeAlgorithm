
package com.renyushuang;

import java.util.Arrays;

/*
*	作者：renyushuang
*	日期：2022年11月16日下午7:47:45
* 
* 	题目：16. 最接近的三数之和
* 	
	给你一个长度为 n 的整数数组 nums 和 一个目标值 target。请你从 nums 中选出三个整数，使它们的和与 target 最接近。
	
	返回这三个数的和。
	
	假定每组输入只存在恰好一个解。
	
	 
	
	示例 1：
	
	输入：nums = [-1,2,1,-4], target = 1
	输出：2
	解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2) 。
	示例 2：
	
	输入：nums = [0,0,0], target = 1
	输出：0
	 
	
	提示：
	
	3 <= nums.length <= 1000
	-1000 <= nums[i] <= 1000
	-104 <= target <= 104


*/
public class LC016 {

	public static void main(String[] args) {

		int[] arr = { -1, 2, 1, -4 };
		System.out.println("" + threeSumClosest(arr, 2));
	}

	public static int threeSumClosest(int[] nums, int target) {
		int last = Integer.MAX_VALUE;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			int l = i + 1;
			int r = nums.length - 1;
			while (l < r) {
				int current = nums[l] + nums[r] + nums[i];
				if (current == target) {
					return target;
				}

				if (Math.abs(current - target) < Math.abs(last - target)) {
					last = current;
				}

				if (current > target) {
					while (l < r && nums[r - 1] == nums[r]) {
						r--;
					}
					r--;
				} else {
					while (l < r && nums[i + 1] == nums[r]) {
						l++;
					}
					l++;
				}

			}
		}

		return last;

	}

}
