class Solution {
    public int[][] kClosest(int[][] p, int k) {
         PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> {
            return (p[b][0] * p[b][0] + p[b][1] * p[b][1]) - (p[a][0] * p[a][0] + p[a][1] * p[a][1]);
        });
        
        for(int i = 0; i < p.length; i++){
            pq.add(i);
            if(pq.size() > k) pq.poll();
        }
        
        int ans[][] = new int[k][2];
        for(int i = 0; i < k; i++){
            ans[i] = p[pq.poll()];
        }
        
        return ans;
    }
}