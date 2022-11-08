package com.renyushuang;

import java.util.Arrays;

/*
*	作者：renyushuang
*	日期：2022年11月4日下午1:34:39
* 
* 	题目：寻找两个正序数组的中位数
* 	给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
* 
* 	算法的时间复杂度应该为 O(log (m+n)) 。
* 
* 
* 	示例：
* 	输入：nums1 = [1,3], nums2 = [2]
*	输出：2.00000
*	解释：合并数组 = [1,2,3] ，中位数 2
*/
public class LC004__ {

	public static void main(String[] args) {
		int a[] = { 1, 3 };
		int b[] = { 2 };
		double result = findMedianSortedArrays(a, b);
		System.out.println(" result = " + result);
		
		
		// 垃圾解法：先合并后二分
		// 优质解法：因为是有序，假设有一个分割线，左边的都是比右边小的，那么左边的最大或者右边的最小就是中位数
		
		
	}
	
	

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

		
		
		
		
		

		return 0;
	}
	
	

//	public static int[] mergeArray(int[] nums1, int[] nums2) {
//
//		int m = nums1.length;
//		int n = nums2.length;
//
//		int arr[] = new int[m + n];
//
//		int nums1Index = 0;
//		int nums2Index = 0;
//
//		for (int i = 0; i < arr.length; i++) {
//			int value1 = nums1Index < m ? nums1[nums1Index] : -1;
//			int value2 = nums2Index < n ? nums2[nums2Index] : -1;
//			if (value1 > value2 && value2 >= 0) {
//				arr[i] = value2;
//				nums2Index++;
//
//			} else {
//				arr[i] = value1;
//
//				nums1Index++;
//			}
//		}
//		return arr;
//	}
//
//	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
//
//		int[] arr = mergeArray(nums1, nums2);
//		System.out.println(" arr = " + Arrays.toString(arr));
//
//		return 0;
//	}
	
	
	
	
}
