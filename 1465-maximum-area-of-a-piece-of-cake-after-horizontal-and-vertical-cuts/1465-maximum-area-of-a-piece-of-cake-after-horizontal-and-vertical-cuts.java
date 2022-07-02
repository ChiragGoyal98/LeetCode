class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        
        long mh = horizontalCuts[0];
        for(int i=1; i<horizontalCuts.length;i++)
        {
            mh = Math.max(horizontalCuts[i] - horizontalCuts[i-1], mh);
        }
        mh = Math.max(h - horizontalCuts[horizontalCuts.length-1], mh);
        long vh = verticalCuts[0];
        for(int i=1; i<verticalCuts.length;i++)
        {
            vh = Math.max(verticalCuts[i] - verticalCuts[i-1], vh);
        }
        vh = Math.max(w - verticalCuts[verticalCuts.length-1], vh);
        int mod = (int) 1e9 + 7;
        return (int)((vh*mh)%mod);

    }
}