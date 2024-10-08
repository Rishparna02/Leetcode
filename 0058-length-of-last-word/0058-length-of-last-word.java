class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1, length = 0;

        while(s.charAt(i) == ' '){
            i--;
        }
        while (s.charAt(i) >= 0 && s.charAt(i) != ' '){
            length++;
            i--;
        }
        return length;
    }
}