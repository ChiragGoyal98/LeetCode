class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int tarPlus= Integer.MAX_VALUE, tarMinus = Integer.MIN_VALUE;
        for(int i=0; i<nums.length-2; i++)
        {
            int s = i+1, e = nums.length-1, k=target-nums[i];
            while(s<e)
            {
                if(nums[s]+nums[e]==k)
                    return target;
                else if(nums[s]+nums[e]<k){
                    int sum = nums[i] + nums[s] + nums[e];
                    tarMinus = Math.max(tarMinus, sum);
                    s++;
                }
                else{
                    int sum = nums[i] + nums[s] + nums[e];
                    tarPlus = Math.min(tarPlus,sum);
                    e--;
                }
            }
        }
        if(tarMinus == Integer.MIN_VALUE)
            return tarPlus;
        if(tarPlus == Integer.MAX_VALUE)
            return tarMinus;
        int a = Math.abs(target-tarMinus);
        int b = Math.abs(tarPlus-target);
        return a<b ? tarMinus : tarPlus;
    }
}