
package com.renyushuang;

import com.common.ListNode;

/*
*	作者：renyushuang
*	日期：2022年11月18日上午10:19:01
* 
* 	题目：21. 合并两个有序链表
* 	
	将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
	
	 
	https://leetcode.cn/problems/merge-two-sorted-lists/
	示例 1：
	
	
	输入：l1 = [1,2,4], l2 = [1,3,4]
	输出：[1,1,2,3,4,4]
	示例 2：
	
	输入：l1 = [], l2 = []
	输出：[]
	示例 3：
	
	输入：l1 = [], l2 = [0]
	输出：[0]
	 
	
	提示：
	
	两个链表的节点数目范围是 [0, 50]
	-100 <= Node.val <= 100
	l1 和 l2 均按 非递减顺序 排列
*/
public class LC021 {

	public static void main(String[] args) {
		int[] l1 = { 1, 2, 4 };
		int[] l2 = { 1, 3, 4 };

		ListNode.printNodList("res = ", mergeTwoLists(ListNode.createNodeList(l1), ListNode.createNodeList(l2)));

	}

	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		
		ListNode temp = new ListNode(-1);
		ListNode res = temp;
		while (list1 != null || list2 != null) {
			int value1 = list1 == null ? Integer.MAX_VALUE : list1.val;
			int value2 = list2 == null ? Integer.MAX_VALUE : list2.val;

			if (value1 < value2) {
				res.next = list1;
				list1 = list1.next;	
			} else {
				res.next = list2;
				list2 = list2.next;
			}
			res = res.next;
		}

		return temp.next;
	}
}
