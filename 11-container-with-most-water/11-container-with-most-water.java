class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1, ans = 0;
        
        while(left<right)
        {
            ans = Math.max(ans, (right-left)*Math.min(height[left], height[right]));
            if(height[left]<height[right])
                left++;
            else
                right--;
        }
        return ans;
    }
}


/*
int maxVol=-1, s=0, e=height.length-1;
        
        while(s<e){
            int min = Math.min(height[s],height[e]);
            int vol = min*(e-s);
            maxVol = vol>maxVol ? vol : maxVol;
            System.out.println(maxVol+" " +s+" "+e);
            int i=s+1, j=e;
            while(height[i]<height[s] && i<e)
                i++;
            min = Math.min(height[i],height[e]);
            vol = min * (e-i);
            maxVol = vol>maxVol ? vol : maxVol;
            System.out.println(maxVol+" " +i+" "+e);
            while(height[j]<height[e] && s<j)
                j--;
            min = Math.min(height[s],height[j]);
            vol = min * (j-s);
            maxVol = vol>maxVol ? vol : maxVol;
            System.out.println(maxVol+" " +s+" "+j);
            s++;
            e--;
        }
        return maxVol;
        */