class Solution {
    public boolean isMonotonic(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        boolean monotonic = true;
        for (int i = 1; i < nums.length; i++){
            if (max <  nums[i]){
                monotonic = false;
                continue;
            }
            max = nums[i];
            if (monotonic && i == nums.length-1){
                return monotonic;
            }
        }
        monotonic = true;
        for (int i = 1; i < nums.length; i++){
            if (min > nums[i]){
                monotonic = false;
                continue;
            }
            min = nums[i];
            if (monotonic && i == nums.length-1){
                return monotonic;
            }
        }
        
        return monotonic;
    }
}