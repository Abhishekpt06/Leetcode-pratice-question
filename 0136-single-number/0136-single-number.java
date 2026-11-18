
class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        
        int num = nums[0];
        for(int i = 1 ; i < n ; i ++){
            num = num ^ nums[i]; 
        }
        return num;
    }
}