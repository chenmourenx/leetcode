package 链表;

public class _83_删除排序链表中的重复元素 {
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

    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            //当链表为空或只有一个元素时，返回head
            if (head == null || head.next == null) return head;
            ListNode tmp = head;
            //tmp不为最后一个元素
            while (tmp.next != null) {
                //当前节点的值和下一个节点的值相等的时候
                if (tmp.val == tmp.next.val) {
                    //当前节点的next指向下下一个节点，即跳过下一个节点（后一个节点）
                    tmp.next = tmp.next.next;
                } else {
                    //跳到下一个节点，再依次比较
                    tmp = tmp.next;
                }

            }
            return head;
        }
    }
}
