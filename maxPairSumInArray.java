# This solution is better than using hashing in my opinion;

class Solution {
    public int maxSum(int[] nums) {
        int max = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if(maxDigit(nums[i]) == maxDigit(nums[j])) {
                    max = Math.max(max, nums[i] + nums[j]);
                }
            }
        }
        return max != 0 ? max : -1;
    }
    int maxDigit(int num) {
        int maxDig = 0;
        while(num > 0) {
            maxDig = Math.max(maxDig, num%10);
            num /= 10;
        }
        return maxDig;
    }        
}
