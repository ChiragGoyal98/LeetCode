class Solution {
    public int countVowelStrings(int n) {
        int a=1, e=1, i=1, o=1, u=1;
        int k=1;
        while(k<n)
        {
            a = a + e + i + o + u;
            e = e + i + o + u;
            i = i + o + u;
            o = o + u;
            k++;
        }
        return a+e+i+o+u;
    }
}
/*
1  5
2  15
3  35
4  70
5  126
6  210
*/