class Solution {
    public int digit(int n){
        if(n<10){
            return n;
        }
       int sum = 0;
        while(n>0){
            sum += n%10;
            n = n/10;
        }
        return digit(sum);
    }
    public int addDigits(int num) {
        return digit(num);
    }
}