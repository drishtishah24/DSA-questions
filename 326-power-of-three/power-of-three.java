class Solution {
    public boolean isPowerOfThree(int n) {
        // long power=1;
        // if(n<=0){
        //     return false;
        // }
        // while(power<n){
        //     power*=3;
        // }
        return n > 0 && 1162261467 % n == 0; 
        //power==n; since 3 is prime
    }
}