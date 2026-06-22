class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> b = new HashMap<>();
        for(int i=0;i<text.length();i++){
            char c = text.charAt(i);
            if(c=='b'||c=='o'||c=='l'||c=='a'||c=='n'){
                b.put(c,b.getOrDefault(c,0)+1);
            }
        }
        int ans = Integer.MAX_VALUE;
        char[] c = {'b','a','l','o','n'};
        for(char ch:c){
            int freq = b.getOrDefault(ch,0);
            if(ch=='o' || ch=='l'){
                freq/=2;
            }
            ans = Math.min(ans,freq);
        }
        return ans;
    }
}