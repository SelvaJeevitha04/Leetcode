class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> count = new HashMap<>();
        int maxCount=0,res=0;
        for(int num:nums){
            count.put(num,count.getOrDefault(num,0)+1);
            if(count.get(num)>maxCount){
                res=num;
                maxCount = count.get(num);
            }
        }
        return res;
    }
}