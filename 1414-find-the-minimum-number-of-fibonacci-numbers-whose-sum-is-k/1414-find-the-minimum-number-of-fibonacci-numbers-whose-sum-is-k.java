class Solution {
    public int findMinFibonacciNumbers(int k) {
        List<Integer> list = new ArrayList<>();
        int prev = 1, curr = 1;
        list.add(1);
        list.add(1);
        while(prev<=k)
        {
            int t = prev + curr;
            prev = curr;
            curr = t;
            list.add(prev);
        }
        int ans = 0;
        for(int i=list.size()-1; i>=0 && k>=0; i--){
            if(list.get(i)>k)
                continue;
            else{
                ans++;
                k -= list.get(i);
                i--;
            }
        }
        return ans;
    }
}

/*
int ans = 0;
        while(k>0)
        {
            int first = 1;
            int second = 1;
            while(second<=k)
            {
                int t = first + second;
                first = second;
                second = t;
            }
            k -= first;
            ans ++;
        }
        return ans;*/