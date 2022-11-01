package com.common;

/*
*	作者：renyushuang
*	日期：2022年10月31日 时间下午1:41:16	
*	
*/

public class Node {

	public Node(int value) {
		this.value = value;
	}

	public int value;
	public Node next;

	public static void printNodList(String name, Node note) {
		System.out.println("-------------------");
		if (note == null) {
			System.out.println(name + "note ==null");
		}

		Node noteCur = note;
		System.out.print(name + " = ");
		while (noteCur != null) {
			System.out.print(noteCur.value);
			noteCur = noteCur.next;

			if (noteCur != null) {
				System.out.print(",");
			}
		}
		System.out.println();
		System.out.println("-------------------");
	}

	public static Node createNodeList(int[] arr) {
		Node node = new Node(-1);
		Node createNode = node;

		for (int i = 0; i < arr.length; i++) {
			createNode.next = new Node(arr[i]);
			createNode = createNode.next;
		}

		return node.next;
	}

}
