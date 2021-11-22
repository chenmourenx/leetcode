package 链表;

public class _141_环形链表 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public class Solution {
        public boolean hasCycle(ListNode head) {
            //快慢指针判断环形
            //先判断链表是否为空或只有一个
            if (head == null || head.next == null) return false;
            //慢指针
            ListNode slow = head;
            //快指针
            ListNode fast = head;
            //快指针不为空且快指针不为最后一个指针
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (fast == slow) return true;
            }
            return false;
        }
    }
}
