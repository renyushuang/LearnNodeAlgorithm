package com.common;

/*
*	作者：renyushuang
*	日期：2022年10月31日 时间下午1:41:16	
*	
*/

public class ListNode {

	public ListNode(int index, ListNode next) {
		this.val = index;
		this.next = next;
	}

	public ListNode(int value) {
		this.val = value;
	}

	public int val;
	public ListNode next;

	public static void printNodList(String name, ListNode note) {
		System.out.println("-------------------");
		if (note == null) {
			System.out.println(name + "note ==null");
		}

		ListNode noteCur = note;
		System.out.print(name + " = ");
		while (noteCur != null) {
			System.out.print(noteCur.val);
			noteCur = noteCur.next;

			if (noteCur != null) {
				System.out.print(",");
			}
		}
		System.out.println();
		System.out.println("-------------------");
	}

	public static ListNode createNodeList(int[] arr) {
		ListNode node = new ListNode(-1);
		ListNode createNode = node;

		for (int i = 0; i < arr.length; i++) {
			createNode.next = new ListNode(arr[i]);
			createNode = createNode.next;
		}

		return node.next;
	}

}
