class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0) return 0;

        for(int i = 0 ; i < haystack.length(); i++){
            if(haystack.charAt(i) == needle.charAt(0))
            if (needle.length() + i > haystack.length())
            return -1;
            else if(haystack.substring(i, needle.length() + i).equals(needle))
            return i;
        }
        return -1;
    }
}