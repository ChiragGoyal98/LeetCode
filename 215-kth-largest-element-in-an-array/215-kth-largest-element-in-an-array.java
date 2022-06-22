class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> numbers = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0; i<nums.length; i++)
        {
            numbers.add(nums[i]);
        }
        
        for(int i=0; i<k-1; i++)
            numbers.poll();
        return numbers.poll();
    }
}