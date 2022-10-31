package com.renyushuang;

import com.common.Node;

/*
*	作者：renyushuang
*	日期：2022年10月31日 时间下午1:38:30
* 
* 	题目：给你两个非null链表，表示两个非负整数。它们每位数字都是按照逆序的方式存储的，并且每个节点智能存储一位数字。
* 	请你将两个数相加，并以相同的形式返回一个表的和链表
*
* 	示例：
*	2——》4-》3
*	5——》6——》4
*	结果 7-》0——》8
*
*/

public class LC002 {

	public static void main(String[] args) {
		int[] note1Nums = { 2, 4, 3 };
		int[] note2Nums = { 5, 6, 4 };

		Node node1 = Node.createNodeList(note1Nums);
		Node node2 = Node.createNodeList(note2Nums);
		
		Node.printNodList("node1 = ", node1);
		Node.printNodList("node2 = ", node2);

	}
}
