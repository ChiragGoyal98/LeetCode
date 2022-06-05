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
    
    public int length(ListNode head)
    {
        ListNode curr = head;
        int s = 0;
        while(curr!=null)
        {
            curr = curr.next;
            s++;
        }
        
        return s;
    }
    
    static ListNode th = null, tt = null;
    
    public void addFirst(ListNode node)
    {
        if(th == null){
            th = node;
            tt = node;
        }
        else{
            node.next = th;
            th = node;
        }
    }
    
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next == null)
            return head;
        int size = length(head);
        if(size<k)
            return head;
        
        ListNode oh = null, ot =null;
        int i = size;
        while(i>=k)
        {
            int j=1;
            while(j<=k)
            {
                ListNode temp = head;
                head = head.next;
                temp.next = null;
                addFirst(temp);
                j++;
                i--;
            }
            if(oh==null)
            {
                oh = th;
                ot = tt;
            }
            else{
                ot.next = th;
                ot = tt;
            }
            tt = th = null;
            
        }
        ot.next = head;
        return oh;
    }
}