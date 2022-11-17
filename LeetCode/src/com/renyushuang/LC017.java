
package com.renyushuang;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
*	作者：renyushuang
*	日期：2022年11月16日下午8:40:12
* 
* 	题目：17. 电话号码的字母组合
* 	
	给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
	
	给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
	
	
	https://leetcode.cn/problems/letter-combinations-of-a-phone-number/
	 
	
	示例 1：
	
	输入：digits = "23"
	输出：["ad","ae","af","bd","be","bf","cd","ce","cf"]
	示例 2：
	
	输入：digits = ""
	输出：[]
	示例 3：
	
	输入：digits = "2"
	输出：["a","b","c"]
	 
	
	提示：
	
	0 <= digits.length <= 4
	digits[i] 是范围 ['2', '9'] 的一个数字。

*/
public class LC017 {

	public static void main(String[] args) {
		System.out.println("" + letterCombinations(""));
	}

	public static List<String> letterCombinations(String digits) {
		if( digits==null|| digits=="") {
			return new ArrayList<>();
		}
		Map<Character, String> phoneMap = new HashMap<Character, String>() {
			{
				put('2', "abc");
				put('3', "def");
				put('4', "ghi");
				put('5', "jkl");
				put('6', "mno");
				put('7', "pqrs");
				put('8', "tuv");
				put('9', "wxyz");
			}
		};
		List<String> res = new ArrayList<>();
		dfs(digits, 0, new StringBuffer(), res, phoneMap);
		return res;
	}
	//回溯深度优先遍历
	private static void dfs(String digits, int index, StringBuffer s, List<String> res,
			Map<Character, String> phoneMap) {
		if (index == digits.length()) {
			res.add(s.toString());
			return;
		}
		char value = digits.charAt(index);
		String phoneChars = phoneMap.get(value);
		for (int i = 0; i < phoneChars.length(); i++) {
			s.append(phoneChars.charAt(i));
			dfs(digits, index + 1, s, res, phoneMap);
			s.deleteCharAt(index);
		}

	}
}
