class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] output = new int [2];
        HashMap<Integer, Integer> list = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int secondNumber = target - nums[i];
            if(list.containsKey(secondNumber)) {
                output[0] = list.get(secondNumber);
                output[1] = i;
            }else{
                list.put(nums[i], i);
            }
        }
        return output;
    }
}
