class Solution {
    public int search(int[] nums, int target) {
        int i ;
        if (nums.length % 2 == 0){
            i = nums.length / 2 - 1 ;
        }
        else{
        i = nums.length / 2;
        }
        int range = nums.length-1;
        if (nums.length == 1 ){
            if (nums[0] == target){
                return 0;
            }
            else{
                return -1;  
            }
        }
        
        if (nums[range] == target){
            return range;
        }
        else if (nums[range-1] == target){
            return range-1;
        }
        while (i >= 0 && (i != range)) {

            if (nums[i] > target) {
                range = i;
                i = i / 2 ;
                System.out.println("We are in the smaller part rn");
            } else if (nums[i] == target) {
                System.out.println("Found the number yey!");
                return i;
            } else {
                if (i + 1 == range){
                    break;
                }
                i = ((i + range) / 2);

                System.out.println("We are in the bigger part rn");
            }
        }
        return -1;
        
    }
}