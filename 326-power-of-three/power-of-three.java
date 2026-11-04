class Solution {
    public boolean isPowerOfThree(int n) {
        long power=1;
        if(n<=0){
            return false;
        }
        while(power<n){
            power*=3;
        }
        return power==n;
    }
}