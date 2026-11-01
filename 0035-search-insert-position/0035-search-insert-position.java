class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int min = nums[0];
        for(int i =0 ;i<n;i++){
            if(nums[i]>=target){
                return i;
            }
            if(i == n-1){
                return n;
            }
            
        }

        return -1;
       
    }
}
