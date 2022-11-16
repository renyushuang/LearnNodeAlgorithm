
package com.renyushuang;

/*
*	作者：renyushuang
*	日期：2022年11月15日下午2:40:27
* 
* 	题目：14. 最长公共前缀
* 	
	编写一个函数来查找字符串数组中的最长公共前缀。
	
	如果不存在公共前缀，返回空字符串 ""。
	
	 
	
	示例 1：
	
	输入：strs = ["flower","flow","flight"]
	输出："fl"
	示例 2：
	
	输入：strs = ["dog","racecar","car"]
	输出：""
	解释：输入不存在公共前缀。
	 
	
	提示：
	
	1 <= strs.length <= 200
	0 <= strs[i].length <= 200
	strs[i] 仅由小写英文字母组成


*/
public class LC014 {

	public static void main(String[] args) {
//		String[] strs = { "flower", "flow", "flight" };
//		System.out.println("" + longestCommonPrefix(strs));
		
		String[] strs1 = { "dog","racecar","car" };
		System.out.println("" + longestCommonPrefix(strs1));
	}

	public static String longestCommonPrefix(String[] strs) {
		StringBuilder s = new StringBuilder();
		int index = 0;
		while (true) {
			String lastStr = null;
			for (String str : strs) {
				if (index == str.length()) {
					lastStr = null;
					break;
				}
				if (lastStr == null) {
					lastStr = str;
				} else if (lastStr.charAt(index) != str.charAt(index)) {
					lastStr = null;
					break;
				}
			}

			if (lastStr == null) {
				break;
			}
			s.append(lastStr.charAt(index));
			index++;
		}

		return s.toString();
	}
}
