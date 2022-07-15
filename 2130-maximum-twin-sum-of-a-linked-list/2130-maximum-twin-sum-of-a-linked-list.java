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
    public int pairSum(ListNode head) {
        int maxSum = 0;
        Stack<Integer> st = new Stack<>();
        ListNode temp = head;
        int n = 0;
        while(temp!=null){
            st.push(temp.val);
            temp = temp.next;
            n++;
        }
        temp = head;
        for(int i=0; i<n/2; i++)
        {
            int sum = temp.val + st.pop();
            maxSum = Math.max(maxSum,sum);
            temp = temp.next;
        }
        return maxSum;
    }
}