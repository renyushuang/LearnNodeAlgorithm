
package com.renyushuang;

import com.common.ListNode;

/*
*	作者：renyushuang
*	日期：2022年11月17日下午8:13:12
* 
* 	题目：19. 删除链表的倒数第 N 个结点
* 	
	给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
	
	 
	https://leetcode.cn/problems/remove-nth-node-from-end-of-list/
	示例 1：
	
	
	输入：head = [1,2,3,4,5], n = 2
	输出：[1,2,3,5]
	示例 2：
	
	输入：head = [1], n = 1
	输出：[]
	示例 3：
	
	输入：head = [1,2], n = 1
	输出：[1]
	 
	
	提示：
	
	链表中结点的数目为 sz
	1 <= sz <= 30
	0 <= Node.val <= 100
	1 <= n <= sz
	 
	
	进阶：你能尝试使用一趟扫描实现吗？


*/
public class LC019__ {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		ListNode.printNodList("res", removeNthFromEnd(ListNode.createNodeList(array), 2));

		int[] array1 = { 1, 2 };
		ListNode.printNodList("res", removeNthFromEnd(ListNode.createNodeList(array1), 1));

		int[] array2 = { 1 };
		ListNode.printNodList("res", removeNthFromEnd(ListNode.createNodeList(array2), 1));
	}

	
	public static ListNode removeNthFromEnd(ListNode head, int n) {


		return null;

	}
	
	
	
//	public static ListNode removeNthFromEnd(ListNode head, int n) {
//		ListNode listNode = new ListNode(0,head);
//		
//		
//		ListNode fast = head;
//		ListNode delete = listNode;
//		for (int i = 0; i < n; ++i) {
//			fast = fast.next;
//		}
//
//		while (fast != null) {
//			fast = fast.next;
//			delete = delete.next;
//		}
//		delete.next = delete.next.next;
//
//		return listNode.next;
//
//	}
}
