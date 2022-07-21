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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null) {
            return null;
        }
        ListNode cur = head, prev = null;
        while (left > 1) {
            prev = cur;
            cur = cur.next;
            left--;
            right--;
        }
        ListNode con = prev, tail = cur;
        ListNode third = null;
        while (right > 0) {
            third = cur.next;
            cur.next = prev;
            prev = cur;
            cur = third;
            right--;
        }
        if (con != null) {
            con.next = prev;
        } else {
            head = prev;
        }

        tail.next = cur;
        return head;
        
        
        
    }
    /*if(head == null || left == right)
            return head ;
        
        ListNode iter = head;
        int i=1;
        while(i<left-1)
        {
            i++;
            iter = iter.next;
        }
        
        ListNode miniTail = iter.next;
        ListNode a = iter;
        iter = iter.next;
        a.next = null;
        while(i<right-1)
        {
            i++;
            iter = iter.next;
        }
        ListNode b = iter.next;
        iter.next = null;
        a.next = reverseList(miniTail);
        miniTail.next = b;
        return head;
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
    }*/
}