class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n: nums)
        {
            map.put(n, map.getOrDefault(n,0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b) -> map.get(b) - map.get(a));
        for(int key : map.keySet())
        {
            pq.add(key);
        }
        // while(pq.size()>k){
        //     pq.poll();
        // }
        int []ans = new int[k];
        for(int i = 0; i<k; i++){
            ans[i] = pq.poll();
        }
        return ans;
    }
}