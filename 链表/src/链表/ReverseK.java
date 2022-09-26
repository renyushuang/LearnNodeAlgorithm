package 链表;

// K个节点组内逆序调整
public class ReverseK {

	public static void main(String[] args) {

	}

	// 1. d = f(x,5) 数五个
	public static Node getGroupEnd(Node start, int k) {

		while (--k == 0 && start != null) {
			start = start.next;
		}

		return start;
	}

	// s->a->b->e-?
	// e b a s ? 
	
	public static void reverse(Node start, Node end) {
		end = end.next;
		Node pre = null;
		Node cur = start;
		Node next = null;
		while (cur != end) {
			next = cur.next;
			cur.next = pre;
			pre = cur;
			cur = next;
		}

		start.next = end;

	}

	// 1. d = f(x,5) 数五个
	// 2.将数好的k个值进行逆序
	public static Node reverseK(Node root, int k) {

	}
}
