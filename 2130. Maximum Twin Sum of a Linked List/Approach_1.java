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
    private ListNode reverseList(ListNode head){
        if(head.next == null) return head;
        ListNode newhead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newhead;
    }
    private ListNode MiddleOfList(ListNode head){
        ListNode slow,fast;
        slow = head;
        fast = head.next.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = slow.next;
        slow.next = null;
        return temp;
    }
    public int pairSum(ListNode head) {
        if(head.next == null){
            return head.val + head.next.val;
        }
        ListNode mid = MiddleOfList(head);
        ListNode newHead = reverseList(mid);
        int maxi = Integer.MIN_VALUE; 

        while(head != null){
            int node = head.val;
            int twin = newHead.val;
            maxi = Math.max(maxi,node+twin);
            head = head.next;
            newHead = newHead.next;
        }
        return maxi;
    }
}