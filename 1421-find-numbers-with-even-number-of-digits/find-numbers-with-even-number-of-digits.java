class Solution {
    public int findNumbers(int[] nums) {
        int r = 0;
        for(int i:nums){
            if(digitCount(i)%2==0){
                r++;
            }
        }
        return r;
    }
    public int digitCount(int i){
        int count =0;
        while(i>0){
            count++;
            i=i/10;
        }
        return count;
    }
        
}