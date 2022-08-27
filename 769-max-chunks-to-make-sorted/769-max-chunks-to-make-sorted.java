class Solution {
    public int maxChunksToSorted(int[] arr) {
        if(arr.length==1)
            return 1;
        int ans = 0;
        int max = -1;
        for(int i=0; i<arr.length; i++)
        {
            max = Math.max(max,arr[i]);
            if(i==max)
            {
                ans++;
                if(i+1<arr.length)
                    max = arr[i+1];
            }
            // else{
            //     max = Math.max(max,arr[i]);
            //     //System.out.println(i+" "+max+" ");
            // }
        }
        return ans;
    }
}