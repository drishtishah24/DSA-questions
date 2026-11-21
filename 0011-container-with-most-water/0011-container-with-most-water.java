class Solution {
    public int maxArea(int[] height) {
        //brute force
    // int maxWater=0;

    // for(int i=0;i<height.length;i++){
    //     for(int j=i+1;j<height.length;j++){
    //         int ht=Math.min(height[i],height[j]);
    //         int width=j-i;
    //         int currWater=ht*width;
    //         maxWater=Math.max(maxWater,currWater);

    //     }
    // }    
    // return maxWater;

    //2 pointer approach
    int maxWater=0;
    int lp=0;
    int rp=height.length-1;
    
    while(lp<rp){
        int ht=Math.min(height[lp],height[rp]);
        int width=rp-lp;
        int currWater=ht*width;
        maxWater=Math.max(maxWater,currWater);

        //update ptr
        if(height[lp]<height[rp]){
            lp++;
        }
        else {
            rp--;
        }
    }
    return maxWater;
    }
}