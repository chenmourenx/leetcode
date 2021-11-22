package 链表;

public class _206_反转链表 {
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

    //递归
//	class Solution {
//	    public ListNode reverseList(ListNode head) {
//	    	//如果节点为空或只有一个节点，返回头节点
//			if(head==null||head.next==null) return head;
//			//递
//			ListNode newhead=reverseList(head.next);
//			//[1,2,3,4,5]反转，归开始的时候
//			//head=4,此时head.next=5,head.next.next=head,即5的下一个节点为4
//			head.next.next=head;
//			//head.next为空节点，此时4和5反转过来了
//			head.next=null;
//			//返回反转过来的新链表
//			return newhead;
//
//	    }
//	}

    //迭代
    class Solution {
        public ListNode reverseList(ListNode head) {
            if (head == null || head.next == null) return head;
            ListNode prev = null;
            ListNode curr = head;
            while (curr != null) {
                //存放下一个节点
                ListNode tmp = curr.next;
                //翻转前后两个节点
                curr.next = prev;
                prev = curr;
                curr = tmp;
            }
            return prev;

        }
    }
}
