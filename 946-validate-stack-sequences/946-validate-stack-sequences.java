class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stck = new Stack();
        int n = pushed.length;
        int j=0;
        for(int p: pushed){
            stck.push(p);
            while(stck.size()!=0 && j<n && stck.peek() == popped[j])
            {
                stck.pop();
                j++;
            }
        }
        return j==n;
    }
}