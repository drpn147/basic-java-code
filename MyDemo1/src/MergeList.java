import java.util.*;

class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}
}

class MergeLists {
	Node head;

	public void addToTheLast(Node node) {
		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null)
				temp = temp.next;
			temp.next = node;
		}
	}

	void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {
		int n = scan.nextInt();
		int m = scan.nextInt();
		MergeLists llist1 = new MergeLists();
		MergeLists llist2 = new MergeLists();

		for (int i = 0; i < n; i++) {
			int element = scan.nextInt();
			llist1.addToTheLast(new Node(element));
		}

		for (int i = 0; i < m; i++) {
			int element = scan.nextInt();
			llist2.addToTheLast(new Node(element));
		}

		llist1.head = new Gfg().listMerge(llist1.head, llist2.head);
		llist1.printList();

	}
}

class Gfg {

	Node listMerge(Node headA, Node headB) {
		Node result = new Node(-1);
		Node p = result;
		while (headA != null && headB != null) {
			if (headA.data <= headB.data) {
				p.next = headA;
				headA = headA.next;
			} else {
				p.next = headB;
				headB = headB.next;
			}
			p = p.next;
		}
		if (headA == null) {
			p.next = headB;
		} else if (headB == null) {
			p.next = headA;
		}
		return result.next;
	}

}