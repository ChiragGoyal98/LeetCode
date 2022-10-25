class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder w1 = new StringBuilder();
        for (String s : word1) {
            w1.append(s);
        }
        StringBuilder w2 = new StringBuilder();
        for (String s : word2) {
            w2.append(s);
        }
        return w1.compareTo(w2) == 0;
    }
}