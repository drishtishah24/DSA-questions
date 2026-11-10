class Solution {
    public boolean isPowerOfTwo(int n) {
    //   int i=0;
    //   long power=0;
    // if(n<=0){
    //     return false;
    // }
    //   while(power<n){
    //     power=(long)Math.pow(2,i);

    //     i++;
    //   }  
    //   if(power!=n){
    //     return false;
    //   }else{
    //     return true;
    //   }
    if(n<=0){
        return false;
    }
    if((n & (n-1))==0){
        return true;
    }
    return false;
    }
}