class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int j = 1;
        int sum = 0;
        for(int i = 0;i<n;i++){
            if(n%j==0){
                sum+=nums[i]*nums[i];
            }
            j++;
        }
        return sum;
        
    }
}