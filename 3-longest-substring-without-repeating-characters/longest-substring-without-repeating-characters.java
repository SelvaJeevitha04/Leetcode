class Solution {
    public int lengthOfLongestSubstring(String s) {
        int r = 0;
        int l =0;
        int m = 0;
        Set<Character> ml = new HashSet<>();
        for(r = 0;r<s.length();r++){
            if(!ml.contains(s.charAt(r))){
                ml.add(s.charAt(r));
                m = Math.max(m,r-l+1);
            }
            else{
                while(ml.contains(s.charAt(r))){
                    ml.remove(s.charAt(l));
                    l++;
                }
                ml.add(s.charAt(r));
            }
        }
        return m;
    }
}