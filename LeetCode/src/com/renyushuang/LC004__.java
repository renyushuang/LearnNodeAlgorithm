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
//		int a[] = { 1, 3 };
//		int b[] = { 2 };

		int a[] = { 1, 3 };
		int b[] = { 2 };
		double result = findMedianSortedArrays(a, b);
		System.out.println(" result = " + result);

		// 垃圾解法：先合并后二分
		// 优质解法：因为是有序，假设有一个分割线，左边的都是比右边小的，那么左边的最大或者右边的最小就是中位数

	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

		int len1 = nums1.length;
		int len2 = nums2.length;
		int totalLength = len1 + len2;
		if (totalLength % 2 == 1) {
			int mid = totalLength / 2;
			return getKthElement(nums1, nums2, mid + 1);
		} else {
			int mid1 = totalLength / 2 - 1;
			int mid2 = totalLength / 2;

			return (getKthElement(nums1, nums2, mid1 + 1) + getKthElement(nums1, nums2, mid2 + 1)) / 2;
		}
	}

	private static int getKthElement(int[] nums1, int[] nums2, int k) {
		int len1 = nums1.length;
		int len2 = nums2.length;

		int index1 = 0;
		int index2 = 0;

		while (true) {
			if (index1 == len1) {
				return nums2[index2 + k - 1];
			}
			if (index2 == len2) {
				return nums1[index1 + k - 1];
			}

			if (k == 1) {
				return Math.min(nums1[index1], nums2[index2]);
			}

			int half = k / 2;
			int newIndex1 = Math.min(index1 + half, len1) - 1;
			int newIndex2 = Math.min(index2 + half, len2) - 1;

			int p1 = nums1[newIndex1];
			int p2 = nums2[newIndex2];

			if (p1 <= p2) {
				k -= (newIndex1 - index1 + 1);
				index1 = newIndex1 + 1;
			} else {
				k -= (newIndex2 - index2 + 1);
				index2 = newIndex2 + 1;

			}

		}

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
