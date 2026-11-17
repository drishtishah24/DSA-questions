class Solution {
    public int removeDuplicates(int[] nums) {
      int j=0;
      for(int i=0;i<nums.length-1;i++ ){
        if(nums.length<=1) return nums.length;
        if(nums[i]!=nums[i+1]){
            
           nums[j]=nums[i];
           j++; 
        }
      }  
      nums[j]=nums[nums.length-1];  //to add the last element
      j++;

      return j;
    }
}