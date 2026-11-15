class Solution {
    public int minOperations(String s) {
       int count=0;

       //choices 01010,10101
       for(int i=0;i<s.length();i++){
        //for even position 1s
        if(i%2==0){ //for string starting with 0
           if(s.charAt(i)=='1'){
            count++;
           }
           }
        else{
            if(s.charAt(i)=='0'){
                count++;
            }
           
        }

       } 

       //for 01010...vs 101010...
       return Math.min(count,s.length()-count);
    }
}