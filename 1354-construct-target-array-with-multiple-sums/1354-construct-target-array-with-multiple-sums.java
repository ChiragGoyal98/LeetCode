class Solution {
    public boolean isPossible(int[] target) {
        if(target.length == 1)
            return target[0] == 1;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int sum = 0;
        for(int t:target){
            pq.add(t);
            sum +=t;
        }
        
        //while max value !=1
        while(pq.peek()!=1)
        {
            int curr = pq.poll(); // current maximum value;
            
            if(sum - curr==1)
                return true;
            
            int x = curr % (sum-curr);
            sum -= curr;
            sum +=x;
            
            if(x == 0 || x == curr)
                return false;
            pq.add(x);
        }
        return true;
    }
}