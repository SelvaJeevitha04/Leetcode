class Solution {
    public int subtractProductAndSum(int n) {
       int s = 0,ml=1;
       while(n>0){
            int m = n%10;
            s = s+m;
            ml = ml*m;
            n=n/10;
       }
       return ml - s;
    }
}