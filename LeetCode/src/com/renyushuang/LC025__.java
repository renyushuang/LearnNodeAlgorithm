
package com.renyushuang;

import com.common.ListNode;

/*
*	作者：renyushuang
*	日期：2022年11月20日下午10:17:45
* 
* 	题目：25. K 个一组翻转链表
* 	
	给你链表的头节点 head ，每 k 个节点一组进行翻转，请你返回修改后的链表。
	
	k 是一个正整数，它的值小于或等于链表的长度。如果节点总数不是 k 的整数倍，那么请将最后剩余的节点保持原有顺序。
	
	你不能只是单纯的改变节点内部的值，而是需要实际进行节点交换。
	
	 
	
	示例 1：
	https://leetcode.cn/problems/reverse-nodes-in-k-group/
	
	输入：head = [1,2,3,4,5], k = 2
	输出：[2,1,4,3,5]
	示例 2：
	
	
	
	输入：head = [1,2,3,4,5], k = 3
	输出：[3,2,1,4,5]
	 
	
	提示：
	链表中的节点数目为 n
	1 <= k <= n <= 5000
	0 <= Node.val <= 1000
	 
	
	进阶：你可以设计一个只用 O(1) 额外内存空间的算法解决此问题吗
	

*/
public class LC025__ {

	public static void main(String[] args) {
		int[] aar = { 1, 2, 3, 4, 5 };

		ListNode aa = ListNode.createNodeList(aar);
		ListNode.printNodList("res = ", reverseKGroup(aa, 3));
	}

	public static ListNode reverseKGroup(ListNode head, int k) {
		ListNode res = new ListNode(-1);
		res.next = head;
		ListNode start = res;
		ListNode end = start;

		while (start != null) {
			for (int i = 0; i < k; i++) {
				end = end.next;
				if (end == null) {
					return res.next;
				}
			}

			ListNode rev = revert(start, end);
			start = rev;
			end = rev;
		}

		

		return res.next;

	}

	private static ListNode revert(ListNode start, ListNode end) {
		ListNode.printNodList("start = ", start);
		ListNode.printNodList("end = ", end);

		ListNode pre = null;

		ListNode cur = start.next;
		ListNode first = cur;
		ListNode endNode = end.next;

		while (cur != endNode) {
			ListNode temp = cur.next;
			cur.next = pre;
			pre = cur;
			cur = temp;
		}
		ListNode.printNodList("revert pre", pre);
		ListNode.printNodList("revert cur", cur);
		ListNode.printNodList("revert start", start);

		start.next = pre;
		first.next = cur;
		return first;
	}

}
