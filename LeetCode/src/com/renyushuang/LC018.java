
package com.renyushuang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
*	作者：renyushuang
*	日期：2022年11月17日下午7:16:11
* 
* 	题目：18. 四数之和
* 	
	给你一个由 n 个整数组成的数组 nums ，和一个目标值 target 。请你找出并返回满足下述全部条件且不重复的四元组 [nums[a], nums[b], nums[c], nums[d]] （若两个四元组元素一一对应，则认为两个四元组重复）：
	
	0 <= a, b, c, d < n
	a、b、c 和 d 互不相同
	nums[a] + nums[b] + nums[c] + nums[d] == target
	你可以按 任意顺序 返回答案 。
	
	 
	
	示例 1：
	
	输入：nums = , target = 0
	输出：[[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
	示例 2：
	
	输入：nums = [2,2,2,2,2], target = 8
	输出：[[2,2,2,2]]
	 
	
	提示：
	
	1 <= nums.length <= 200
	-109 <= nums[i] <= 109
	-109 <= target <= 109


*/
public class LC018 {

	public static void main(String[] args) {

//		int[] arr = { 1, 0, -1, 0, -2, 2 };
//		System.out.println("" + fourSum(arr, 0));
//
//		int[] arr1 = { 2, 2, 2, 2, 2 };
//		System.out.println("" + fourSum(arr1, 8));

//		int[] arr2 = { -2,-1,-1,1,1,2,2 };
//		System.out.println("" + fourSum(arr2, 0));
		int[] arr3 = { -479, -472, -469, -461, -456, -420, -412, -403, -391, -377, -362, -361, -340, -336, -336, -323,
				-315, -301, -288, -272, -271, -246, -244, -227, -226, -225, -210, -194, -190, -187, -183, -176, -167,
				-143, -140, -123, -120, -74, -60, -40, -39, -37, -34, -33, -29, -26, -23, -18, -17, -11, -9, 6, 8, 20,
				29, 35, 45, 48, 58, 65, 122, 124, 127, 129, 145, 164, 182, 198, 199, 206, 207, 217, 218, 226, 267, 274,
				278, 278, 309, 322, 323, 327, 350, 361, 372, 376, 387, 391, 434, 449, 457, 465, 488 };
		System.out.println("" + fourSum(arr3, 1979));

	}

	public static List<List<Integer>> fourSum(int[] nums, int target) {
		Arrays.sort(nums);
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		for (int i = 0; i < nums.length - 3; i++) {
			if (i > 0 && nums[i - 1] == nums[i]) {
				continue;
			}
			int num1 = nums[i];
			for (int j = i + 1; j < nums.length - 2; j++) {

				if (j > i + 1 && nums[j - 1] == nums[j]) {
					continue;
				}
				int num2 = nums[j];
				int l = j + 1;
				int r = nums.length - 1;
				while (l < r) {
					long cur = (long) num1 + (long) num2 + (long) nums[l] + (long) nums[r];

					if (cur < target) {
						while (l < r && nums[l + 1] == nums[l]) {
							l++;
						}
						l++;

					} else if (cur > target) {
						while (l < r && nums[r - 1] == nums[r]) {
							r--;
						}
						r--;
					} else {

						res.add(Arrays.asList(num1, num2, nums[l], nums[r]));

						while (l < r && nums[l + 1] == nums[l]) {
							l++;
						}

						l++;

						while (l < r && nums[r - 1] == nums[r]) {
							r--;
						}
						r--;
					}

				}

			}
		}

		return res;

	}
}
