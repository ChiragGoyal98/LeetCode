class Solution {
    public boolean areNumbersAscending(String s) {
        int min = Integer.MIN_VALUE, size=s.length();
        
        for(String str : s.split(" "))
        {
            if(Character.isDigit(str.charAt(0))){
                int currMin = Integer.parseInt(str);
                if(currMin<=min)
                    return false;
                min=currMin;
            }
        }
        return true;
    }
}