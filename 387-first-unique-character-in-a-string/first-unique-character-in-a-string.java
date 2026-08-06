class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        HashMap<Character,Integer> r = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            r.put(c,r.getOrDefault(c,0)+1);
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(r.get(ch)==1){
                return i;
            }
        }
        return -1;
    }
}