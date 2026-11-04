class Solution {
    public int minMoves(int[] nums) {
        int sum = 0;
        int big = -1;

        for(int i = 0;i < nums.length;i++){
            if(nums[i] > big){
                big = nums[i];
            }
        }
        for(int i = 0;i < nums.length;i++){
            sum = sum + (big - nums[i]);
        }
        return sum;
    }
}