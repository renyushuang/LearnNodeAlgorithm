
package com.renyushuang;

import java.util.Arrays;

/*
*	作者：renyushuang
*	日期：2022年12月1日下午2:25:05
* 
* 	题目：34. 在排序数组中查找元素的第一个和最后一个位置
* 	
	给你一个按照非递减顺序排列的整数数组 nums，和一个目标值 target。请你找出给定目标值在数组中的开始位置和结束位置。
	
	如果数组中不存在目标值 target，返回 [-1, -1]。
	
	你必须设计并实现时间复杂度为 O(log n) 的算法解决此问题。
	
	 
	
	示例 1：
	
	输入：nums = [5,7,7,8,8,10], target = 8
	输出：[3,4]
	示例 2：
	
	输入：nums = [5,7,7,8,8,10], target = 6
	输出：[-1,-1]
	示例 3：
	
	输入：nums = [], target = 0
	输出：[-1,-1]
	 
	
	提示：
	
	0 <= nums.length <= 105
	-109 <= nums[i] <= 109
	nums 是一个非递减数组
	-109 <= target <= 109
	通过次数688,495提交次数1,626,303


*/
public class LC034__ {

	public static void main(String[] args) {
//		int aar[] = { 5, 7, 7, 8, 8, 10 };
//		System.out.println("res = " + Arrays.toString(searchRange(aar, 8)));
		
		
		int aar1[] = { 1 };
		System.out.println("res = " + Arrays.toString(searchRange(aar1, 1)));
	}

	public static int[] searchRange(int[] nums, int target) {
		int array[] = { -1, -1 };
		int start = binarySearch(nums, target, true);
		int end = binarySearch(nums, target, false)-1;

		if (start <= end && end < nums.length && nums[start] == target && nums[end] == target) {
			array[0] = start;
			array[1] = end;
		}
		System.out.println("start = " + start);
		System.out.println("end = " + end);
		return array;
	}

	public static int binarySearch(int nums[], int target, boolean low) {
		int start = 0;
		int end = nums.length - 1;
		int res = nums.length;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (nums[mid] > target || (low && nums[mid] >= target)) {
				end = mid - 1;
				res = mid;
			} else {
				start = mid + 1;
			}

		}

		return res;
	}

}
