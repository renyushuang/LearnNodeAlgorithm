
package com.renyushuang;

/*
*	作者：renyushuang
*	日期：2022年11月22日上午11:00:02
* 
* 	题目：28. 找出字符串中第一个匹配项的下标
* 	输入：haystack = "sadbutsad", needle = "sad"
	输出：0
	解释："sad" 在下标 0 和 6 处匹配。
	第一个匹配项的下标是 0 ，所以返回 0 。


	输入：haystack = "leetcode", needle = "leeto"
	输出：-1
	解释："leeto" 没有在 "leetcode" 中出现，所以返回 -1 。
	 
	
	提示：
	
	1 <= haystack.length, needle.length <= 104
	haystack 和 needle 仅由小写英文字符组成
*/
public class LC028 {

	public static void main(String[] args) {
		System.out.println(strStr("a", "a"));
	}

	public static int strStr(String haystack, String needle) {

		int neLne = needle.length();
		int haLen = haystack.length();
		char start = needle.charAt(0);
		for (int i = 0; i < haLen && i + neLne <= haLen; i++) {

			char ha = haystack.charAt(i);
			if (ha == start && i + neLne <= haLen) {
				if (match(haystack, needle, i, neLne)) {
					return i;
				}
			}
		}

		return -1;

	}

	public static boolean match(String haystack, String needle, int start, int len) {
		System.out.println("start " + start);
		System.out.println("len = " + len);
		String a = haystack.substring(start, start + len);
		System.out.println(a);
		for (int i = 0; i < len; i++) {
			if (haystack.charAt(start + i) != needle.charAt(i)) {
				return false;
			}
		}

		return true;
	}

}
