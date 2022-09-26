package 链表;

class Node {
	public Node(int value) {
		this.value = value;
	}

	int value;
	Node next;
}

public class SingleLinkList {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		Node root = new Node(-1);
		Node temp = root;
		for (int i : arr) {
			temp.next = new Node(i);
			temp = temp.next;
		}
		root = root.next;
		printList(root);

		printList(revert(root));
	}

	// 反转链表
	private static Node revert(Node next) {
		// TODO Auto-generated method stub

		Node pre = null;
		Node current = next;

		while (current != null) {
			Node temp = current.next;
			current.next = pre;
			pre = current;
			current = temp;
		}
		return pre;
	}

	public static void printList(Node node) {
		System.out.println();
		Node temp = node;

		while (temp != null) {
			System.out.print(temp.value + ",");
			temp = temp.next;
		}
		System.out.println();
	}

	
	


}
