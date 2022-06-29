class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        
        ArrayList<int[]> ans = new ArrayList<>();
        
        int start = intervals[0][0], end =intervals[0][1], i=1;
        
        while(i<intervals.length)
        {
            int s = intervals[i][0], e = intervals[i][1];
            
            if(s<=end)
            {
                end = Math.max(end,e);
            }
            else{
                ans.add(new int[]{start,end});
                start = s;
                end = e;
            }
            i++;
        }
        ans.add(new int[]{start,end});
//         int [][]finalAns = new int[ans.size()][];
        
//         for(i=0; i<ans.size(); i++)
//         {
//             int []a = new int[2];
//             //for(int j=0; j<2; j++)
//                 a= ans.get(i);//.get(j);
//             finalAns[i] = a;
//         }
        return ans.toArray(new int[ans.size()][]);
    }
}