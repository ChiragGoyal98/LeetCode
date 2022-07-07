class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s3.length()!=s1.length() + s2.length())
            return false;
        boolean [][] visited = new boolean[s1.length()+1][s2.length()+1];
        return dfs(s1,s2,s3,0,0,0,visited);
    }
    public boolean dfs(String s1, String s2, String s3, int i, int j, int k, boolean[][] visited)
    {
        if(i==s1.length() && j == s2.length())
            return true;
        if(i>s1.length() || j > s2.length())
            return false;
        
        if(visited[i][j])
            return false;
        visited[i][j] = true;
        boolean a = false, b = false;
        if(i<s1.length() && s1.charAt(i) == s3.charAt(k))
            a = dfs(s1,s2,s3,i+1,j,k+1,visited);
        if(j<s2.length() && s2.charAt(j) == s3.charAt(k))
            b = dfs(s1,s2,s3,i,j+1,k+1,visited);
        
        return a || b;
    }
}


/*
if(s3.length()!=s1.length() + s2.length())
            return false;
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();
        
        for(int i=0; i<s1.length(); i++)
        {
            hm1.put(s1.charAt(i), hm1.getOrDefault(s1.charAt(i),0)+1);
        }
        for(int i=0; i<s2.length(); i++)
        {
            hm2.put(s2.charAt(i), hm2.getOrDefault(s2.charAt(i),0)+1);
        }
        // System.out.println(hm1);
        // System.out.println(hm2);
        int i=0;
        while(i<s3.length())
        {
            if(hm1.containsKey(s3.charAt(i))==false && hm2.containsKey(s3.charAt(i))==false)
                return false;
            if(hm1.containsKey(s3.charAt(i))==true && hm1.get(s3.charAt(i))>0)
            {
                hm1.put(s3.charAt(i), hm1.getOrDefault(s3.charAt(i),0)-1);
                i++;
            }
            else if(hm2.containsKey(s3.charAt(i))==true && hm2.get(s3.charAt(i))>0)
            {
                hm2.put(s3.charAt(i), hm2.getOrDefault(s3.charAt(i),0)-1);
                i++;
            }
            else
                return false;
        }
        return true;
*/