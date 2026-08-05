class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();
        int index =0;
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int j=0;j<nums2.length;j++){
            if(set.contains(nums2[j])){
                res.add(nums2[j]);
            }
        }
        int arr[] = new int[res.size()];
        for(int num:res){
            arr[index]=num;
            index++;
        }
        return arr;
    }
}