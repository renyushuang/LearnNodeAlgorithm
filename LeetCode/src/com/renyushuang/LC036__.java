
package com.renyushuang;

import java.util.HashMap;
import java.util.HashSet;

/*
*	作者：renyushuang
*	日期：2022年12月1日下午3:16:13
* 
* 	题目：36. 有效的数独
* 	
	请你判断一个 9 x 9 的数独是否有效。只需要 根据以下规则 ，验证已经填入的数字是否有效即可。
	
	数字 1-9 在每一行只能出现一次。
	数字 1-9 在每一列只能出现一次。
	数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。（请参考示例图）
	 
	
	注意：
	
	一个有效的数独（部分已被填充）不一定是可解的。
	只需要根据以上规则，验证已经填入的数字是否有效即可。
	空白格用 '.' 表示。
	 
	
	示例 1：
	https://leetcode.cn/problems/valid-sudoku/
	
	输入：board = 
	[["5","3",".",".","7",".",".",".","."]
	,["6",".",".","1","9","5",".",".","."]
	,[".","9","8",".",".",".",".","6","."]
	,["8",".",".",".","6",".",".",".","3"]
	,["4",".",".","8",".","3",".",".","1"]
	,["7",".",".",".","2",".",".",".","6"]
	,[".","6",".",".",".",".","2","8","."]
	,[".",".",".","4","1","9",".",".","5"]
	,[".",".",".",".","8",".",".","7","9"]]
	输出：true
	示例 2：
	
	输入：board = 
	[["8","3",".",".","7",".",".",".","."]
	,["6",".",".","1","9","5",".",".","."]
	,[".","9","8",".",".",".",".","6","."]
	,["8",".",".",".","6",".",".",".","3"]
	,["4",".",".","8",".","3",".",".","1"]
	,["7",".",".",".","2",".",".",".","6"]
	,[".","6",".",".",".",".","2","8","."]
	,[".",".",".","4","1","9",".",".","5"]
	,[".",".",".",".","8",".",".","7","9"]]
	输出：false
	解释：除了第一行的第一个数字从 5 改为 8 以外，空格内其他数字均与 示例1 相同。 但由于位于左上角的 3x3 宫内有两个 8 存在, 因此这个数独是无效的。
	 
	
	提示：
	
	board.length == 9
	board[i].length == 9
	board[i][j] 是一位数字（1-9）或者 '.'

*/
public class LC036__ {

	public static void main(String[] args) {

	}

	// 暴力解法
	public static boolean isValidSudoku(char[][] board) {
		boolean[][] r = new boolean[9][9];
		boolean[][] c = new boolean[9][9];
		boolean[][] bo = new boolean[9][9];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				char value = board[i][j];
				if (value == '.') {
					continue;
				}
				int curIndex = value - '1';
				int boxIndex = j / 3 + i / 3 * 3;
				if (r[i][curIndex] || c[curIndex][j] || bo[boxIndex][curIndex]) {
					return false;
				}

				r[i][curIndex] = true;
				c[curIndex][j] = true;
				bo[boxIndex][curIndex] = true;

			}
		}

		return true;
	}

//	// 暴力解法
//	public static boolean isValidSudoku(char[][] board) {
//		HashSet<String> hashset = new HashSet<>();
//		for (int i = 0; i < 9; i++) {
//			for (int j = 0; j < 9; j++) {
//				char value = board[i][j];
//				if (value == '.') {
//					continue;
//				}
//				int boxIndex = j / 3 + i / 3 * 3; // 计算当前是在哪个格子里
//
//				String r = value + "in row" + i;
//				String c = value + "int col" + j;
//				String bo = value + "in box" + boxIndex;
//
//				boolean res = hashset.add(r) && hashset.add(c) && hashset.add(bo);
//				if (!res) {
//					return false;
//				}
//
//			}
//		}
//
//		return true;
//	}

}
