
class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int[] ans = new int[nums.length];

        int p1 = 0;
        int p2 = n;
        int j = 0;

        for (int i = 0; p2 < nums.length; i++) {
            
            ans[j] = nums[p1];
            j++;

            ans[j] = nums[p2];
            j++;

            p1++;
            p2++;
        }

        return ans;
    }
}