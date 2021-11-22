package 链表;

public class _237_删除链表中的节点 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public void deleteNode(ListNode node) {
            //只要把要删的节点伪装成下一个节点
            node.val = node.next.val;
            node.next.val = node.next.next.val;


        }
    }
}
