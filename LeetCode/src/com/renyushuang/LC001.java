package com.renyushuang;
import java.util.Arrays;
import java.util.HashMap;

/*
* 作者：renyushuang
* 日期：2022年10月31日
* 
* 题目：
* 给一个整数数组nums和一个整数目标值target，请你在该数组中找到目标值target的那两个整数，并返回它们的数组下标。
* 
* 示例：	输入 nums = [2,7,11,15].target = 9
* 		输出 [0,1]
*/
public class LC001 {

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int [] result = twoSum(nums ,9);
		System.out.println(Arrays.toString(result));
	}

	public static int[] twoSum(int[] nums,int target) {
		HashMap<Integer,Integer> hashmap = new HashMap<>();
		
		for(int i=0;i<nums.length;i++) {
			 int value= target-nums[i];
			 
			 if(hashmap.containsKey(value)) {
				 return new int[] {hashmap.get(value),i};
			 }
			 
			 hashmap.put(nums[i], i);
		}
		
		return new int[] {};
	}

}
