class Solution {
    public double myPow(double x, int n) {
     double ans=1;
     long N=n;
     if (x == 0.0) return 0.0;
    if (n == 0) return 1.0;
     if(N<0){
        N=-N;
     }
     while(N>0){
        if((N&1)!=0){ //checking if lsb is 1
            ans=ans*x;
        }
        x=x*x;
        N=N>>1;
     }   
     return n < 0 ? 1.0 / ans : ans;
    }
}