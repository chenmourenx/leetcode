package 链表;

public class _21_合并两个有序链表 {
	//迭代
	public <T> ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		//哑节点
		ListNode prehead = new ListNode(-1);

		//定义一个头结点的prev
		ListNode prev = prehead;
		//当l1和l2都不为空
		while (l1 != null && l2 != null) {
			//哪个值小，prev就指向哪个，然后l往后移一位
			if (l1.val <= l2.val) {
				prev.next = l1;
				l1 = l1.next;
			} else {
				prev.next = l2;
				l2 = l2.next;
			}
			//l移完prev移
			prev = prev.next;
		}

		//循环结束，会有一个null没有被合并,直接将链表末尾指向那个null
		prev.next = l1 == null ? l2 : l1;

		//哑结点后面即为头节点
		return prehead.next;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
}
