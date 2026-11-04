class Solution {
    public boolean isPowerOfThree(int n) {
        int i=0;
        long power=0;
        if(n<=0){
            return false;
        }
        while(power<n){
            power=(long)Math.pow(3,i);
            i++;
        }
        return power==n;
    }
}