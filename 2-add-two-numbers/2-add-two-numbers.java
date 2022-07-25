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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        
        ListNode head = new ListNode(-1);
        ListNode curr = head;
        int carry = 0;
        
        while(l1!=null || l2!=null || carry!=0){
            int val1 = (l1 != null) ? l1.val : 0; 
            int val2 = (l2 != null) ? l2.val : 0; 
            
            int sum = val1 + val2 + carry;
            int rem = sum%10;
            carry = sum/10;
            
            ListNode node = new ListNode(rem);
            curr.next = node;
            curr = curr.next;
            if(l1!=null)    l1 = l1.next;
            if(l2!=null)    l2 = l2.next;
        }
        return head.next;
    }
}