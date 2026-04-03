class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length() , m = word2.length();

        StringBuilder res = new StringBuilder();

        for(int i = 0, j = 0; i < n || j < m; i++, j++){
            if(i < n){
                res.append(word1.charAt(i));
            }
            if(j < m){
                res.append(word2.charAt(i));
            }
        }
        return res.toString();
    }
}