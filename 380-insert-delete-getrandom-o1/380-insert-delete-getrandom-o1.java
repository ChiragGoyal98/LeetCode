class RandomizedSet {
    List<Integer> nums;
    HashMap<Integer,Integer> hm;
    Random random;

    public RandomizedSet() {
        hm = new HashMap<>();
        nums = new ArrayList<>();
        random = new Random();
    }
    
    public boolean insert(int val) {
        if(hm.containsKey(val))
            return false;
        else
        {
            hm.put(val,nums.size());
            nums.add(val);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if(hm.containsKey(val)==false)
            return false;
        
        int idx = hm.get(val);
        int lastIdx = nums.size()-1;
        if(idx!=lastIdx)
        {
            int lastVal = nums.get(lastIdx);
            nums.set(idx, lastVal);
            hm.put(lastVal, idx);
        }
        hm.remove(val);
        nums.remove(lastIdx);
        return true;
        
    }
    
    public int getRandom() {
        return nums.get(random.nextInt(nums.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */