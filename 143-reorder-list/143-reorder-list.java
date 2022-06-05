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
    public ListNode midNode(ListNode node)
    {
        if(node==null || node.next == null)
            return node;
        
        ListNode slow = node, fast = node;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    public ListNode rev(ListNode head){
        if(head == null)
            return head;
        
        ListNode prev = null, curr = head;
        while(curr!=null)
        {
            ListNode save = curr.next;
            curr.next = prev;
            prev = curr;
            curr = save;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        if(head == null || head.next == null)
            return;
        
        
        ListNode mid = midNode(head);
        ListNode h2 = mid.next;
        h2 = rev(h2);
        mid.next = null;
        ListNode c1 = head, c2 = h2;
        
        while(c2!= null && c1!=null)
        {
            ListNode t1 = c1.next, t2 = c2.next;
            
            c1.next = c2;
            c2.next = t1;
            c1 = t1;
            c2 = t2;
        }
    }
}