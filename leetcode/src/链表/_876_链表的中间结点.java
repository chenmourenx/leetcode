package 链表;

public class _876_链表的中间结点 {
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

    //快慢指针
    //当快指针到最后一个或null时，此时的慢指针就是中间节点
    //快指针为两步，慢指针为一步，须慢指针先走，因为如果链表为偶数个时，题目中指出要中间两个的后面一个节点
    //所以要先将慢指针指向后一个节点，再把快指针指向null，然后返回判断的时候离开循环
    class Solution {
        public ListNode middleNode(ListNode head) {
            //如果链表为空时，返回null
            if (head == null) return null;
            ListNode fast = head;
            ListNode slow = head;
            while (fast != null && fast.next != null) {
                //走一步
                slow = slow.next;
                //走两步
                fast = fast.next.next;

            }
            return slow;
        }
    }
}
