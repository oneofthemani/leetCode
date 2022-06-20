class Solution {
    public int pivotIndex(int[] nums) {
        int sumLeft = 0;
        int sumRight;
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if (i != 0) {
                sumLeft += nums[i-1];
            }
            sumRight = sum - sumLeft - nums[i];

            if (sumRight == sumLeft) {
                return i;
            }
            else if (sumLeft == 0 && sumRight == 0) {
                return 0;
            }
        }

        return -1;
    }
}