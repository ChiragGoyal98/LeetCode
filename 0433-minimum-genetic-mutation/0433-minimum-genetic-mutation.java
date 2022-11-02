class Solution {
    public int minMutation(String start, String end, String[] bank) {
        Queue<String> q = new LinkedList<>();
        HashSet<String> vis = new HashSet<String>();
        List<String> banks = Arrays.asList(bank);
        int steps = 0;
        q.add(start);
        vis.add(start);
        while (!q.isEmpty()) {
            // iterate from the back because the size of q varies
            // which would result in wrong answer if you iterate from 0
            // alternatively, you can define a new variable for q.size() before the for-loop
            // i.e. 
            // int n = q.size();
            // for (int i = 0; i < n; i++) { 
            for (int i = q.size(); i > 0; i--) {
                // get the gene string from the queue
                String s = q.poll();
                // if it is same as `end`, that means we found the answer
                if (s.equals(end)) return steps;
                // otherwise, given a gene string with 8-character long
                // we can replace each character with "A", "C", "G" and "T"
                char[] ca = s.toCharArray();
                for (int j = 0; j < 8; j++) {
                    // s[j] will be modified later, 
                    // hence store the original character here
                    char oc = ca[j];
                    // iterate ACGT
                    // alternatively, you can use `for (char c : "ACGT") { ... }`
                    for (int k = 0; k < 4; k++) {
                        // replace the j-th character in s with the k-th character in ACGT
                        ca[j] = "ACGT".charAt(k);
                        // we can reach the next node if the next node hasn't been visited
                        // and the next node is available in `bank`
                        String t = new String(ca);
                        if (!vis.contains(t) && banks.contains(t)) {
                            // push the next node to the queue
                            q.add(t);
                            // and mark it visited
                            vis.add(t);
                        }
                    }
                    // since we updated the character, we revert it back
                    ca[j] = oc;
                }
            }
            // increase the step count
            steps += 1;
        }
        // not able to reach `end`, return -1 here
        return -1;
    }
}