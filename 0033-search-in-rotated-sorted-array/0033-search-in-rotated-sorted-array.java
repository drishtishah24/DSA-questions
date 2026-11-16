class Solution {
    public int search(int[] nums, int target) {
        int si=0;
        int ei=nums.length-1;
        
        while(si<=ei){
        int mid=si+(ei-si)/2;
        if(nums[mid]==target){
            return mid;
        }

        //mid on line 1
        if(nums[si]<=nums[mid]){

            //case a: left
            if(nums[si]<=target && target<=nums[mid]){
                ei=mid-1;   //if recursion then return search(nums,target,si,mid)
            }else{ //case b:right
                si=mid+1;
            }
        }
        //mid on line 2
        else{
            //case c: right
            if(nums[mid]<=target && target<=nums[ei]){
                si=mid+1;
            }else{ //case d:left
                ei=mid-1;
            }

        }
        }
        return -1;
    }
}