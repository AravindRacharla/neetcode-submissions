/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head1 = slow.next;
        ListNode prev = slow.next= null;
        while(head1!=null){
            ListNode nextNode = head1.next;
            head1.next = prev;
            prev =head1;
            head1 = nextNode;
        }
        head1 = prev;
        
        while(head1!=null){
            ListNode tmp1  = head.next;
            ListNode tmp2 = head1.next;
            head.next = head1;
            head1.next =tmp1;
            head = tmp1;
            head1 = tmp2; 
        }
        
    }
}
