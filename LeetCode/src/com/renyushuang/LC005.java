
/**
 * 
 */
package com.renyushuang;

/*
*	作者：renyushuang
*	日期：2022年11月7日下午1:04:29
* 
* 	题目：最长回文子串
* 	给你一个字符串 s，找到 s 中最长的回文子串。
* 
* 	示例：
* 	输入：s = "babad"
*	输出：："bab"
*	解释："aba" 同样是符合题意的答案。
*
*	输入：s = "cbbd"
* 	输出："bb"
*
*/
public class LC005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(longestPalindrome("babad"));
//		System.out.println(longestPalindrome("cbbd"));
//		System.out.println(longestPalindrome("bb"));
//		System.out.println(longestPalindrome("ccc"));
		System.out.println(longestPalindrome("aacabdkacaa"));
	}
//	public static String longestPalindrome(String s) {
//        int len = s.length();
//        if (len < 2) {
//            return s;
//        }
//
//        int maxLen = 1;
//        int begin = 0;
//        // dp[i][j] 表示 s[i..j] 是否是回文串
//        boolean[][] dp = new boolean[len][len];
//        // 初始化：所有长度为 1 的子串都是回文串
//        for (int i = 0; i < len; i++) {
//            dp[i][i] = true;
//        }
//
//        char[] charArray = s.toCharArray();
//        // 递推开始
//        // 先枚举子串长度
//        for (int L = 2; L <= len; L++) {
//            // 枚举左边界，左边界的上限设置可以宽松一些
//            for (int i = 0; i < len; i++) {
//                // 由 L 和 i 可以确定右边界，即 j - i + 1 = L 得
//                int j = L + i - 1;
//                // 如果右边界越界，就可以退出当前循环
//                if (j >= len) {
//                    break;
//                }
//
//                if (charArray[i] != charArray[j]) {
//                    dp[i][j] = false;
//                } else {
//                    if (j - i < 3) {
//                        dp[i][j] = true;
//                    } else {
//                        dp[i][j] = dp[i + 1][j - 1];
//                    }
//                }
//
//                // 只要 dp[i][L] == true 成立，就表示子串 s[i..L] 是回文，此时记录回文长度和起始位置
//                if (dp[i][j] && j - i + 1 > maxLen) {
//                    maxLen = j - i + 1;
//                    begin = i;
//                }
//            }
//        }
//        return s.substring(begin, begin + maxLen);
//    }

	public static String longestPalindrome(String s) {
		int length = s.length();
		boolean[][] dp = new boolean[length][length];

		for (int i = 0; i < length; i++) {
			dp[i][i] = true;
		}
		int max = 1;
		int start = 0;

		for (int j = 0; j < length; j++) {
			for (int i = 0; i < length && i < j; i++) {

				if (s.charAt(i) != s.charAt(j)) {
					dp[i][j] = false;
				} else {
					if ((j - i) < 3) {
						dp[i][j] = true;
					} else {
						dp[i][j] = dp[i + 1][j - 1];
					}
				}

				if (dp[i][j] && j - i + 1 > max) {
					max = j - i + 1;
					start = i;
				}
			}
		}

//		for (int i = 0; i < length; i++) {
//			for (int j = 0; j < length; j++) {
//				System.out.print(dp[i][j] + " ");
//			}
//			System.out.println();
//		}

		return s.substring(start, start + max);
	}
	
//	错误
//	public static String longestPalindrome(String s) {
//		int length = s.length();
//		boolean[][] dp = new boolean[length][length];
//
//		for (int i = 0; i < length; i++) {
//			dp[i][i] = true;
//		}
//		int max = 1;
//		int start = 0;
//		for (int j = 0; j < length; j++) {
//			for (int i = 0; i < length && i < j; i++) {
//				if (s.charAt(i) != s.charAt(j)) {
//					dp[i][j] = false;
//				} else {
//					if ((i - j) < 3) {
//						dp[i][j] = true;
//					} else {
//						dp[i][j] = dp[i + 1][j - 1];
//					}
//				}
//
//				if (dp[i][j] && (j - i + 1) > max) {
//					max = j - i + 1;
//					start = i;
//				}
//			}
//		}
//
//		return s.substring(start, start + max);
//    }
}
