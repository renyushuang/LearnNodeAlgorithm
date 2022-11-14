package com.renyushuang;

import java.util.HashMap;

/*
*	作者：renyushuang
*	日期：2022年11月2日 时间下午1:17:04
* 
* 	题目：无重复字符串的最长子串
*	给定一个字符串s，请你找出其中不含重复字符的最长子串的长度
* 	
* 	示例：
*	输入：abcabcbb
*	输出：3
*/

public class LC003 {

	public static void main(String[] args) {

		System.out.println("result = " + lengthOflongestSubstring("abcabcbb"));
	}

	public static int lengthOflongestSubstring(String s) {
		int res = 0;
		int start = 0;
		HashMap<Character, Integer> cache = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char value = s.charAt(i);
			if (cache.containsKey(value) && cache.get(value) >= start) {
				int oldIndex = cache.get(value);
				start = oldIndex + 1;
				cache.put(value, i);
			} else {
				cache.put(value, i);
				int cur = i - start + 1;
				res = Math.max(res, cur);

			}
		}
		return res;
	}

}
