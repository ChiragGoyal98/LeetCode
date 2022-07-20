class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        List<List<String>> ans = new ArrayList<>();
        
        for(int i=0; i<searchWord.length(); i++)
        {
            List<String> smallAns = new ArrayList<>();
            String sub = searchWord.substring(0, i+1);
            
            for(String product: products)
            {
                if(product.startsWith(sub)){
                    smallAns.add(product);
                }
                if(smallAns.size() == 3)
                    break;
            }
            ans.add(smallAns);
        }
        return ans;
    }
}