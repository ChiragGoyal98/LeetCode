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
    public ListNode partition(ListNode head, int x) {
        if(head == null)
            return head;
        
        ListNode smaller_h = new ListNode(0);
        ListNode smaller = smaller_h;
        ListNode larger_h = new ListNode(0);
        ListNode larger = larger_h;
        
        while(head!=null)
        {
            if(head.val<x)
            {
                smaller.next = head;
                smaller = smaller.next;
            }
            else{
                larger.next = head;
                larger = larger.next;
            }
            head = head.next;
        }
        larger.next = null;
        smaller.next = larger_h.next;
        return smaller_h.next;
    }
}