
package com.renyushuang;

import java.util.Deque;
import java.util.LinkedList;

/*
*	作者：renyushuang
*	日期：2022年11月23日下午8:49:07
* 
* 	题目：32. 最长有效括号
* 	
	给你一个只包含 '(' 和 ')' 的字符串，找出最长有效（格式正确且连续）括号子串的长度。
	
	 
	
	示例 1：
	
	输入：s = "(()"
	输出：2
	解释：最长有效括号子串是 "()"
	示例 2：
	
	输入：s = ")()())"
	输出：4
	解释：最长有效括号子串是 "()()"
	示例 3：
	
	输入：s = ""
	输出：0
	 
	
	提示：
	
	0 <= s.length <= 3 * 104
	s[i] 为 '(' 或 ')'

*/
public class LC032 {

	public static void main(String[] args) {
		System.out.println("" + longestValidParentheses("(()"));
		System.out.println("" + longestValidParentheses(")()())"));
//		System.out.println("" + longestValidParentheses(""));
		System.out.println("" + longestValidParentheses("()(()"));
		System.out.println("" + longestValidParentheses(""));

	}

	public static int longestValidParentheses(String s) {

		Deque<Character> stack = new LinkedList<>();
		int dp[] = new int[s.length()];
		int res = 0;

		for (int i = 0; i < s.length(); i++) {
			int index = i;

			char cur = s.charAt(i);
			if (cur == '(') {
				stack.push(cur);
			} else {
				if (stack.isEmpty()) {
					continue;
				}
				stack.pop();
				int pairs = 1 + dp[index - 1];
				int preIndex = index - pairs * 2;
				if (preIndex > 0) {
					pairs += dp[preIndex];
				}
				dp[index] = pairs;
				res = Math.max(dp[index], res);
			}
		}

		return res * 2;

	}
}
