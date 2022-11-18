
package com.renyushuang;

import java.util.ArrayList;
import java.util.List;

/*
*	作者：renyushuang
*	日期：2022年11月18日上午10:42:30
* 
* 	题目：22. 括号生成
* 	
	数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。


	示例 1：
	
	输入：n = 3
	输出：["((()))","(()())","(())()","()(())","()()()"]
	示例 2：
	
	输入：n = 1
	输出：["()"]
	 
	
	提示：
	
	1 <= n <= 8
*/
public class LC022__ {

	public static void main(String[] args) {
		System.out.println(generateParenthesis(3));
	}

	public static List<String> generateParenthesis(int n) {
		String base = "()";

		List<String> res = new ArrayList();
		dfs(res, new StringBuffer(), 0, 0, n);
		return res;
	}

	private static void dfs(List<String> res, StringBuffer builder, int open, int close, int max) {
		if (open + close == max * 2) {
			res.add(builder.toString());
			return;
		}

		if (open < max) {
			builder.append('(');
			dfs(res, builder, open + 1, close, max);
			builder.deleteCharAt(builder.length() - 1);
		}

		if (close < open) {
			builder.append(')');
			dfs(res, builder, open, close + 1, max);
			builder.deleteCharAt(builder.length() - 1);
		}

	}
}
