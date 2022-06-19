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
    public ListNode mergeKLists(ListNode[] lists) {
        return partition(lists, 0, lists.length-1);
    }
    
    public ListNode partition(ListNode[] lists, int s, int e){
        if(s==e)
            return lists[s];
        if(s<e){
            int q = (s+e)/2;
            ListNode l1 = partition(lists, s, q);
            ListNode l2 = partition(lists, q+1, e);
            
            return mergeTwoLists(l1, l2);
        }
        return null;
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
}