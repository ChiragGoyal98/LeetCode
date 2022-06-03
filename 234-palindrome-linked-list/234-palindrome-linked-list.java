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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stck = new Stack<Integer>();
        ListNode temp = head;
        while(temp!=null)
        {
            stck.push(temp.val);
            temp = temp.next;
        }
        
        temp = head;
        
        while(temp!=null)
        {
            
            if(stck.peek() == temp.val)
                stck.pop();
            else
                return false;
            temp = temp.next;
        }
        return true;
    }
}