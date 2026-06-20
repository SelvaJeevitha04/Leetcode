class Solution {
    public int lengthOfLastWord(String s) {
        String lastWord = s.trim().substring(s.trim().lastIndexOf(" ") + 1); 
        return lastWord.length();
    }
}