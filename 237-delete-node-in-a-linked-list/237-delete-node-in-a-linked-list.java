/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode trav = node;
        while(trav.next.next!=null)
        {
            trav.val = trav.next.val;
            trav = trav.next;
        }
        trav.val = trav.next.val;
        trav.next = null;
    }
}