class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        int size = matrix.length;
        for(int i=0; i<size; i++)
        {
            for(int j = 0; j<size; j++){
                if(pq.size()<k)
                    pq.add(matrix[i][j]);
                else{
                    if(matrix[i][j]<pq.peek())
                    {
                        pq.poll();
                        pq.add(matrix[i][j]);
                    }
                }
            }
        }
        return pq.peek();
    }
}