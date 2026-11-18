class Solution {
    public int[] applyOperations(int[] nums) {
        int insertpos=0;
       for(int i=0;i<nums.length;i++){
        //loop from 0 to n-2
        if(i<nums.length-1 && nums[i]==nums[i+1]){
            nums[i]*=2;
            nums[i+1]=0;
        }
        //to add only non-zero elements
        if(nums[i]!=0){
            nums[insertpos]=nums[i];
            insertpos++;
        }
       } 
       //fill zero for rest spaces
       while(insertpos<nums.length){
        nums[insertpos]=0;
        insertpos++;
       }
       
       return nums;
    }
}