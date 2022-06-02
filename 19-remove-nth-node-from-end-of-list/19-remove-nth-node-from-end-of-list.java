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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)
            return null;
        if(head.next==null && n==1)
            return null;
        int size=0;
        
        int i=0;
        ListNode temp = head;
        
        while(temp!=null)
        {
            temp=temp.next;
            size++;
        }
        n=size-n;
        if(n==0)
            return head.next;
        temp=head;
        while(temp.next!=null && i<n-1)
        {
            temp = temp.next;
            i++;
        }
        if(temp.next==null)
            return head;
        temp.next = temp.next.next;
        return head;
    }
}