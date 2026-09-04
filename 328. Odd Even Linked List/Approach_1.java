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
    public ListNode oddEvenList(ListNode head) {
         if(head == null || head.next == null) return head;
         ListNode oddHead , evenHead ,ptr1 , ptr2;
         oddHead = head;
         evenHead = head.next;
         ptr1 = oddHead;
         ptr2 = evenHead;
         while((ptr1 != null && ptr2 != null) && (ptr1.next != null && ptr2.next != null)){
            ptr1.next = ptr1.next.next;
            ptr1 = ptr1.next;   
            ptr2.next = ptr2.next.next;
            ptr2 = ptr2.next;
        } 
         ptr1.next = evenHead;
         return oddHead;
    }
}