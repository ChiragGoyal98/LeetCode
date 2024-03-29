class TimeMap {
    HashMap<String, HashMap<Integer, String>> map;
    public TimeMap() {
        map = new HashMap<String, HashMap<Integer, String>>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key))
            map.put(key, new HashMap<Integer, String>());
        
        map.get(key).put(timestamp, value);
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key))
            return "";
        for(int t = timestamp; t>=1; t--)
        {
            if(map.get(key).containsKey(t))
                return map.get(key).get(t);
        }
        return "";
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */