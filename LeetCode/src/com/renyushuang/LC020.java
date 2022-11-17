
package com.renyushuang;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

/*
*	作者：renyushuang
*	日期：2022年11月17日下午8:44:50
* 
* 	题目：20. 有效的括号
* 	
	给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
	
	有效字符串需满足：
	
	左括号必须用相同类型的右括号闭合。
	左括号必须以正确的顺序闭合。
	每个右括号都有一个对应的相同类型的左括号。
	 
	
	示例 1：
	
	输入：s = "()"
	输出：true
	示例 2：
	
	输入：s = "()[]{}"
	输出：true
	示例 3：
	
	输入：s = "(]"
	输出：false
	 
	
	提示：
	
	1 <= s.length <= 104
	s 仅由括号 '()[]{}' 组成


*/
public class LC020 {

	public static void main(String[] args) {
		System.out.println("" + isValid("()[]{}"));
		System.out.println("" + isValid("["));
	}

	public static boolean isValid(String s) {

		HashMap<Character, Character> left = new HashMap<>();
		left.put('(', ')');
		left.put('[', ']');
		left.put('{', '}');
//		HashMap<Character, Character> right = new HashMap<>();
//		right.put('}', '{');
//		right.put(')', '(');
//		right.put(']', '[');
		Deque<Character> stack = new LinkedList<>();

		for (int i = 0; i < s.length(); i++) {
			char value = s.charAt(i);
			if (left.containsKey(value)) {
				stack.push(value);
			} else {
				if (stack.size() == 0) {
					return false;
				}
				char pre = stack.pop();
				System.out.println("" + value + "---" + pre);
				if (left.get(pre) != value) {
					return false;
				}
			}

		}
		if (stack.size() > 0) {
			return false;
		}

		return true;

	}
}
