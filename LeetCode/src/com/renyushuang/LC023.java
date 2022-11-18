
package com.renyushuang;

import com.common.ListNode;

/*
*	作者：renyushuang
*	日期：2022年11月18日下午1:40:19
* 
* 	题目：23. 合并K个升序链表
* 	
给你一个链表数组，每个链表都已经按升序排列。

请你将所有链表合并到一个升序链表中，返回合并后的链表。

 

示例 1：

	输入：lists = [[1,4,5],[1,3,4],[2,6]]
	输出：[1,1,2,3,4,4,5,6]
	解释：链表数组如下：
	[
	  1->4->5,
	  1->3->4,
	  2->6
	]
	将它们合并到一个有序链表中得到。
	1->1->2->3->4->4->5->6
	示例 2：
	
	输入：lists = []
	输出：[]
	示例 3：
	
	输入：lists = [[]]
	输出：[]
	 
	
	提示：
	
	k == lists.length
	0 <= k <= 10^4
	0 <= lists[i].length <= 500
	-10^4 <= lists[i][j] <= 10^4
	lists[i] 按 升序 排列
	lists[i].length 的总和不超过 10^4
*/
public class LC023 {

	public static void main(String[] args) {
		int a[] = { 1, 4, 5 };
		int b[] = { 1, 3, 4 };
		int c[] = { 2, 6 };
		ListNode[] aa = { ListNode.createNodeList(a), ListNode.createNodeList(b), ListNode.createNodeList(c) };
		ListNode.printNodList("res", mergeKLists(aa));
	}

	public static ListNode mergeKLists(ListNode[] lists) {

		int len = lists.length;

		return mergeKLists(lists, 0, len-1);
	}

	public static ListNode mergeKLists(ListNode[] lists, int start, int end) {
		if (start == end) {
			return lists[start];
		}

		if (start > end) {
			return null;
		}

		int mid = (start + end) >>1;
		return merge(mergeKLists(lists, start, mid), mergeKLists(lists, mid + 1, end));
	}

	private static ListNode merge(ListNode list1, ListNode list2) {
		ListNode l = new ListNode(-1);
		ListNode temp = l;
		while (list1 != null || list2 != null) {
			int val1 = list1 == null ? Integer.MAX_VALUE : list1.val;
			int val2 = list2 == null ? Integer.MAX_VALUE : list2.val;

			if (val1 <= val2) {
				temp.next = new ListNode(val1);
				list1 = list1.next;
			} else {
				temp.next = new ListNode(val2);
				list2 = list2.next;
			}
			temp = temp.next;
		}

		return l.next;
	}

}
