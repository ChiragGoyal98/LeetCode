class Solution {
    public int minPartitions(String n) {
        int ans = -1;
        for(int i=0; i<n.length(); i++)
        {
            int a = (int)(n.charAt(i) - '0');
            if(a>ans)
                ans = a;
        }
        return ans;
    }
}