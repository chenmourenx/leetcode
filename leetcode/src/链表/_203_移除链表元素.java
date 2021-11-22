package 链表;

public class _203_移除链表元素 {
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

        public ListNode removeElements(ListNode head, int val) {
            //当头节点为所要删的值，头节点不能为空，头节点变为next
            while (head != null && head.val == val) {
                head = head.next;
            }
            //当链表为空时
            if (head == null) return head;

            ListNode tmp = head;
            //保证当前节点下面还有节点
            while (tmp.next != null) {
                //如果下一个节点的值为所要删的值
                if (tmp.next.val == val) {
                    //删除节点
                    tmp.next = tmp.next.next;
                } else {
                    //换到下一个节点
                    tmp = tmp.next;
                }

            }
            return head;

        }
    }

}
