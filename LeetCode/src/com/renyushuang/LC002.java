package com.renyushuang;

import com.common.ListNode;

/*
*	作者：renyushuang
*	日期：2022年10月31日 时间下午1:38:30
* 
* 	题目：两数相加
* 	给你两个非null链表，表示两个非负整数。它们每位数字都是按照逆序的方式存储的，并且每个节点智能存储一位数字。
* 	请你将两个数相加，并以相同的形式返回一个表的和链表
*
* 	示例：
*	2——》4-》3
*	5——》6——》4
*	结果 7-》0——》8
*
*/

public class LC002 {

	public static ListNode addTwoNumbers(ListNode node1, ListNode node2) {

		ListNode result = null;
		ListNode tail = null;

		int flag = 0;
		while (node1 != null || node2 != null) {
			int node1Value = node1 != null ? node1.value : 0;
			int node2Value = node2 != null ? node2.value : 0;

			int value = node1Value + node2Value + flag;
			System.out.println("node1Value = " + node1Value + "   ---node2Value = " + node2Value);

			System.out.println("value = " + value);
			flag = value / 10;

			if (result == null) {
				result = tail = new ListNode(value % 10);
			} else {
				tail.next = new ListNode(value % 10);
				tail = tail.next;
			}

			node1 = node1 != null ? node1.next : node1;
			node2 = node2 != null ? node2.next : node2;
		}

		if (flag > 0) {
			tail.next = new ListNode(flag);
		}

		return result;
	}

	public static void main(String[] args) {
		int[] note1Nums = { 2, 4, 3 };
		int[] note2Nums = { 5, 6, 4 };

		ListNode node1 = ListNode.createNodeList(note1Nums);
		ListNode node2 = ListNode.createNodeList(note2Nums);

		ListNode.printNodList("node1 = ", node1);
		ListNode.printNodList("node2 = ", node2);

		ListNode result = addTwoNumbers(node1, node2);
		ListNode.printNodList("result = ", result);

	}

}
