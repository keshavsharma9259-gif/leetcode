class Solution {
    public int missingMultiple(int[] nums, int k) {
        int multiple = 1;
        while(true){
            boolean found = false;

            for(int i =0; i<nums.length; i++){
                if(nums[i]== k * multiple){
                    found = true;
                    break;
                }
            }
            if(! found){
                return k * multiple;
            }
            multiple ++;
        }
    }
}