class Solution {
    public boolean makesquare(int[] matchsticks) {
        int perimeter=0;
        for(int ele : matchsticks)
            perimeter +=ele;
        int target = perimeter/4;
        if(target*4!=perimeter)
            return false;
        
        Arrays.sort(matchsticks);
        if(matchsticks[0]>target)
            return false;
        int sides[] = new int[4];
        return dfs(matchsticks, 0, sides, target);
    }
    public boolean dfs(int []arr, int idx, int []sides, int target)
    {
        //base case
        if(idx == arr.length)
        {
            return (sides[0]==sides[1] && sides[1]==sides[2] && sides[2] == sides[3]);
        }
        
        for(int i=0; i<sides.length; i++)
        {
            if(sides[i]+arr[idx]>target)
                continue;
            
            //optimisation
            int j=i-1;
            while(j>=0)
            {
                if(sides[j]==sides[i])
                    break;
                j--;
            }
            //mark
            if(j!=-1)
                continue;
            sides[i]+=arr[idx];
            if(dfs(arr, idx+1, sides, target))
                return true;
            //unmark
            sides[i]-=arr[idx];
        }
        return false;
    }
}