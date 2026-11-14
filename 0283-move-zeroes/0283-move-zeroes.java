class Solution {
    public void moveZeroes(int[] nums) {
        int nonzero=0;
        //[0,1,0,3,2]
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){    
                 nums[nonzero]=nums[i];
                nonzero++; //till 2 and then it becomes 3
            }//[1,1,0,3,2],[1,3,0,3,2],[1,3,2,3,2]
        }
        for(int i=nonzero;i<nums.length;i++){  //3 to length
            nums[i]=0; // [1,3,2,0,0]
        }
    }
}