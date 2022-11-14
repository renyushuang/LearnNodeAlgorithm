
package com.renyushuang;

/*
*	作者：renyushuang
*	日期：2022年11月14日下午1:41:25
* 
* 	题目：9. 回文数
* 	给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。

	回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
	
	例如，121 是回文，而 123 不是。
	 
	
	示例 1：
	
	输入：x = 121
	输出：true
	示例 2：
	
	输入：x = -121
	输出：false
	解释：从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
	示例 3：
	
	输入：x = 10
	输出：false
	解释：从右向左读, 为 01 。因此它不是一个回文数。
	 
	
	提示：
	
	-231 <= x <= 231 - 1
	
*/
public class LC009 {

	public static void main(String[] args) {
		System.out.println("isPalindrome() = " + isPalindrome(11));
	}

	public static boolean isPalindrome(int x) {

		if (x < 0) {
			return false;
		}

		int current = 0;
		int index = 0;
		while (current <= x) {

			if (current == x) {
				return true;
			}

			int dis = x % 10;

			current = current * 10 + dis;
			if (current == 0) {
				return false;
			}
			if (current == x) {
				return true;
			}

			x = x / 10;
			index++;
		}

		return false;
	}

}
