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
    
    public boolean isPalindrome(ListNode head) {
//         Stack<Integer> stck = new Stack<Integer>();
//         ListNode temp = head;
//         while(temp!=null)
//         {
//             stck.push(temp.val);
//             temp = temp.next;
//         }
        
//         temp = head;
        
//         while(temp!=null)
//         {
//             if(stck.peek() == temp.val)
//                 stck.pop();
//             else
//                 return false;
//             temp = temp.next;
//         }
//         return true;
        if(head == null)
            return true;
        
        ListNode mid  = midNode(head);
        
        ListNode h2 = mid.next;
        h2 = rev(h2);
        mid.next = null;
        
        ListNode i = head, j = h2;
        
        while(i!=null && j!=null)
        {
            if(i.val != j.val)
                return false;
            i = i.next;
            j = j.next;
        }
        return true;
        
        
        
        
    }
}