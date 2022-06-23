class Solution {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses, (a, b) -> { return a[1] - b[1];});
        
        PriorityQueue<Integer> heap = new PriorityQueue<>((d1, d2) -> Integer.compare(d2, d1));
        
        int time = 0;
        for(int[] course: courses) {
            int duration = course[0], lastDay = course[1];
            time += duration;
            heap.add(duration);
            if(time > lastDay) {
                time -= heap.poll();
            }
        }
        return heap.size();
    }
}