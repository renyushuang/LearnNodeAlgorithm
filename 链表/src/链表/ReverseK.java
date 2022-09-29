package 链表;

/**
 * K个节点组内逆序调整
 * @author renyushuang
 *  k = 3 
 *  链表 3, 2, 1, 6, 5, 4, 7, 8
 * 	反转后 1、2、3  4、5、6  7、8
 * 	
 * 
 * 
 */
public class ReverseK {
	public static void printList(Node node) {
		System.out.println();
		Node temp = node;

		while (temp != null) {
			System.out.print(temp.value + ",");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[] = { 3, 2, 1, 6, 5, 4, 7, 8 };
		Node root = new Node(-1);
		Node temp = root;
		for (int i : arr) {
			temp.next = new Node(i);
			temp = temp.next;
		}
		root = root.next;
		printList(root);

		reverseK(root, 3);
//		printList();

	}

	// 1. d = f(x,5) 数五个
	public static Node getGroupEnd(Node start, int k) {
		while (--k != 0 && start != null) {
			start = start.next;
		}
		return start;
	}

	// s->a->b->e-?
	// e b a s ?

	public static void reverse(Node start, Node end) {
		System.out.println(" reverse start");
		end = end.next;
		Node pre = null;
		Node cur = start;
		Node next = null;
		while (cur != end) {
			System.out.println(cur.value + ",");
			next = cur.next;
			cur.next = pre;
			pre = cur;
			cur = next;

		}
		start.next = end;
		System.out.println("reverse ");
	}

//	// 1. d = f(x,5) 数五个
//	// 2.将数好的k个值进行逆序
	public static Node reverseK(Node heard, int k) {
		// TODO 有点难需要再写几遍
		Node start = heard;
		Node end = getGroupEnd(start, k);
		if (end == null) {
			return heard;
		}
		System.out.println("end.valu  = " + end.value);
		System.out.println("------------");
		heard = end;
		reverse(start, end);

		Node lastEnd = start;

		while (lastEnd.next != null) {
			printList(lastEnd);
			start = lastEnd.next;
			end = getGroupEnd(start, k);
			if (end == null) {
				System.out.println("-----结果1-------");
				printList(heard);
				return heard;
			}
			reverse(start, end);
			lastEnd.next = end;
			lastEnd = start;
		}
		System.out.println("-----结果2-------");
		printList(heard);

		return heard;
	}
}
