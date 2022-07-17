class Solution {
    int count = 0;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int visited[] = new int[rooms.size()];
        Arrays.fill(visited,1);
        return helper(rooms, visited, 0);
    }
    
    public boolean helper(List<List<Integer>> rooms, int visited[], int s)
    {
        count++;
        if(count == rooms.size())
            return true;
        if(visited[s] == 0)
            return true;
        visited[s] = 0;
        
        boolean ans = false;
        System.out.println(rooms.get(s));
        for(int i=0; i<rooms.get(s).size(); i++){
            if(visited[rooms.get(s).get(i)] == 1)
            {
                boolean a = helper(rooms, visited, rooms.get(s).get(i));
                if(a)
                    ans = a;
                // if(ans)
                //     return true;
            }
        }
        return ans;
    }
}