class Solution {
    public boolean checkDivisibility(int n) {
        int orignal = n;
        int sum = 0;
        int product = 1;
        while(n>0){
         int digit = n%10;
         sum = sum +digit;
         product = product *digit;
         n= n/10;
        }
    if (orignal % (sum + product) == 0){
            return true;
        }
        return false;
    }
}