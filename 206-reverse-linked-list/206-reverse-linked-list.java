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
    public ListNode reverseList(ListNode head) {
        if(head==null)
            return head;
        
        
    ListNode previous = null, current = head;

      while(current!=null)
      {
        ListNode save = current.next;
        current.next = previous;
        
        previous = current;
        current = save;
      }
      head = previous;
        return head;
    }   
}