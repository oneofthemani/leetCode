class Solution {
    public int minIncrementForUnique(int[] nums) {
        int[] numsSort = Arrays.stream(nums).sorted().toArray();
            int increment = 0;
            for (int i = 1; i < nums.length; i++) {
                while (numsSort[i] <= numsSort[i-1]) {
                    increment++;
                    numsSort[i] += 1;
                }
            }
            return increment;   
    }
}