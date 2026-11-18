class Solution {
    public boolean search(int[] nums, int target) {
        int si=0;
        int ei=nums.length-1;
        
        while(si<=ei){
            int mid=si+(ei-si)/2;
            if(target==nums[mid]){
                return true;
            }
            if(nums[si]==nums[mid] && nums[mid]==nums[ei]){
                si++;
                ei--;
            }

            //if left half is sorted
            else if(nums[si]<=nums[mid]){
                if(target>=nums[si] && target<nums[mid]){
                    ei=mid-1;
                }else{
                    si=mid+1;
                }
                
            //if right half is sorted
            }else{
                if(target>nums[mid] && target<=nums[ei]){
                    si=mid+1;
                }else{
                    ei=mid-1;
                }
            }

        }
        return false;
    }
}