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
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2==null)
            return null;
        if(list1==null)
            return list2;
        if(list2==null)
            return list1;
        ListNode head = new ListNode();
        ListNode temp = new ListNode();
        int size=0;
        ListNode h1 = list1, h2=list2;
        
        while(h1!=null && h2!=null)
        {
            if(h1.val<=h2.val)
            {
                if(size==0)
                {
                    head = h1;
                    temp = h1;
                    size++;
                }
                else{
                    temp.next = h1;
                    temp = temp.next;
                    size++;
                }
                h1 = h1.next;
            }
            else
            {
                if(size==0)
                {
                    head = h2;
                    temp = h2;
                }
                else{
                    temp.next = h2;
                    temp = temp.next;
                }
                size++;
                h2 = h2.next;
            }
        }
        if(h1!=null)
            temp.next = h1;
        if(h2!=null)
            temp.next = h2;
        
        return head;
    }
    
    
    public ListNode sortList(ListNode head) {
        if(head == null || head.next==null)
            return head;
        
        ListNode mid = midNode(head);
        ListNode h2 = mid.next;
        mid.next = null;
        
        head = sortList(head);
        h2 = sortList(h2);
        
        head = mergeTwoLists(head,h2);
        return head;
    }
}