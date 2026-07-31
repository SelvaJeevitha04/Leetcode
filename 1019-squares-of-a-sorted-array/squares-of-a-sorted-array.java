class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int position = nums.length-1;
        int res[] = new int[nums.length];
        while(left<=right){
            int s1 = nums[left]*nums[left];
            int s2 = nums[right]*nums[right];
            if(s1>s2){
                res[position] = s1;
                left++; 
                position--;
            }
            else{
                res[position] =s2;
                right--;
                position--;
            }
        }
        return res;
    }
}