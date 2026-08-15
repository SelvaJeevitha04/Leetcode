class Solution {
    public String longestPalindrome(String s) {
        int l = s.length();
        if(l<=1){
            return s;
        }
        String max = s.substring(0,1);
        for(int i=0;i<s.length()-1;i++){
            String o = expand(s,i,i);
            String e = expand(s,i,i+1);
            if(o.length()>max.length()){
                max = o;
            }
            if(e.length()>max.length()){
                max=e;
            }
        }
        return max;
    }
    private String expand(String s,int left,int right){
        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1,right);
    }
}