class Solution {
    public double angleClock(int hour, int minutes) {
        double hour_pos = 5 * (hour % 12);
        // 1 hour = 5 units
        //taking into account the movement caused by minute hand
        hour_pos += (5 * minutes/60.0);
        
        double diff = Math.abs(hour_pos - minutes);
        
        return Math.min(diff, 60-diff) * 6;
        
    }
}