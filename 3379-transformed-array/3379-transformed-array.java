class Solution {
    public int[] constructTransformedArray(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {

       
            if (nums[i] == 0) {
                ans[i] = 0;
                continue;
            }

           
            int newIndex = i + nums[i];

        
            if (newIndex >= n) {
                newIndex = newIndex % n;
            }

   
            if (newIndex < 0) {
                newIndex = (newIndex % n + n) % n;
            }

         
            ans[i] = nums[newIndex];
        }

        return ans;
    }
}