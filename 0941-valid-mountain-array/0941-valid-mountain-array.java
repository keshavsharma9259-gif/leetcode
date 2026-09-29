class Solution {
    public boolean validMountainArray(int[] arr) {

       
        int max = arr[0];
        int maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }

      
        if (maxIndex == 0 || maxIndex == arr.length - 1) {
            return false;
        }

       
        for (int i = 0; i < maxIndex; i++) {

            if (arr[i] >= arr[i + 1]) {
                return false;
            }
        }

      
        for (int i = maxIndex; i < arr.length - 1; i++) {

            if (arr[i] <= arr[i + 1]) {
                return false;
            }
        }

        return true;
    }
}