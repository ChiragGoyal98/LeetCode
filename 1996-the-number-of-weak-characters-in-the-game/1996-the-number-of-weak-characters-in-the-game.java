class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        int weak = 0;
        
        Arrays.sort(properties, (a,b) -> (a[0]!=b[0]) ? b[0]-a[0] : a[1] - b[1]);
        int max = Integer.MIN_VALUE;
        for( int []pro: properties){
            if(pro[1]<max)
                weak++;
            max = Math.max(max, pro[1]);
        }
        return weak;
    }
}