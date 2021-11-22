package 链表;

public class _234_回文链表 {
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
        public boolean isPalindrome(ListNode head) {

            //如果链表为空或只有一个元素，返回true
            if (head == null || head.next == null) return true;

            //快慢指针,先把慢指针指到中间，快指针指到最后
            ListNode fast = head;
            ListNode slow = head;
            //当快指针走到尾节点或倒数第二个节点的时候，跳出循环，
            //走到尾节点时，为奇数的链表，倒数第二个的节点时，为偶数的链表
            while (fast.next != null && fast.next.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }


            //翻转后半部分的链表
            ListNode prev = null;
            //后半部分的的头节点的为slow.next
            //例如[1,2,3,2,1]翻转的时候应从2开始
            //[1,2,2,1]翻转的时候应从2开始
            //所以为slow.next
            ListNode curr = slow.next;
            while (curr != null) {
                //存放下一个节点
                ListNode tmp = curr.next;
                //翻转前后两个节点
                //第一次循环时，此时curr的下一个为空，即原来的头节点为尾节点
                //再一次循环，curr,next就指到了prev
                curr.next = prev;
                prev = curr;
                curr = tmp;
            }


            //判断是否回文
            //[1,2,2,1]翻转为[1,2,2,1]，然后头尾向里开始比较，所以这里p2=prev
            ListNode p1 = head;
            ListNode p2 = prev;
            boolean result = true;
            while (p2 != null) {
                //判断前后的值是否相等
                if (p1.val != p2.val) {
                    result = false;
                }
                p1 = p1.next;
                p2 = p2.next;
            }


            //还原链表并返回结果
            ListNode prev1 = null;
            ListNode curr1 = prev1;
            while (curr != null) {
                //存放下一个节点
                ListNode tmp = curr1.next;
                //翻转前后两个节点
                curr1.next = prev1;
                prev1 = curr;
                curr1 = tmp;
                System.out.print(head);
            }

            return result;
        }
    }

}

