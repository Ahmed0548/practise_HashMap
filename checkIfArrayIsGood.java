lass Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int i = 1;
        if(nums[0] != 1) return false;
        while(i < nums.length) {
            if(nums[i] - nums[i-1] == 1) {
                i++;
            }else if(nums[i] == nums[i-1] && i == nums.length-1) {
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
}
# This Solutin is better than using hashing;
