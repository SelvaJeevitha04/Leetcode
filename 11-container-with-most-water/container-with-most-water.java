class Solution {
    public int maxArea(int[] height) {
        int right = height.length-1;
        int left = 0;
        int max = 0,res = 0;
        int w = 0,h=0; 
        while(left<right){
            w = right - left;
            h = Math.min(height[left],height[right]);
            res = w*h;
            if(res>max){
                max = res;
            }
            if(height[left]<height[right]){
                left++;
            }
            else right--;
        }
        return max;
    }
}