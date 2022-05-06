class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ans[] = new int[m+n];
        int k=0, i=0, j=0;
        while(k<m+n && i<m && j<n)
        {
            if(nums1[i]<=nums2[j])
            {
                ans[k] = nums1[i];
                i++;
                k++;
            }
            else{
                ans[k] = nums2[j];
                j++;
                k++;
            }
        }
        while(i<m)
        {
            
            ans[k] = nums1[i];
            k++;
            i++;
        }
        while(j<n)
        {
            ans[k] = nums2[j];
            k++;
            j++;
        }
        for(int a=0; a<k; a++)
        {
            nums1[a] = ans[a];
        }
        
    }
}