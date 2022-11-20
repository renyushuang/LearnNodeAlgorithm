
package com.renyushuang;

import com.common.ListNode;

/*
*	作者：renyushuang
*	日期：2022年11月18日下午7:53:46
* 
* 	题目：24. 两两交换链表中的节点
* 	
	给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。
	
	 
	https://leetcode.cn/problems/swap-nodes-in-pairs/
	示例 1：
	
	
	输入：head = [1,2,3,4]
	输出：[2,1,4,3]
	示例 2：
	
	输入：head = []
	输出：[]
	示例 3：
	
	输入：head = [1]
	输出：[1]
	 
	
	提示：
	
	链表中节点的数目在范围 [0, 100] 内
	0 <= Node.val <= 100
*/
public class LC024 {
	public static void main(String[] args) {
		int[] aar = { 1, 2, 3, 4 };

		ListNode.printNodList("res", swapPairs(ListNode.createNodeList(aar)));

	}

	public static ListNode swapPairs(ListNode head) {
		ListNode tem = new ListNode(-1);
		tem.next = head;
		ListNode cur = tem;
		while (cur.next != null && cur.next.next != null) {
			ListNode node1 = cur.next;
			ListNode node2 = cur.next.next;
			ListNode temp = node2.next;
			cur.next = node2;
			node2.next = node1;
			node1.next = temp;
			cur = node1;
		}

		return tem.next;
	}

}
