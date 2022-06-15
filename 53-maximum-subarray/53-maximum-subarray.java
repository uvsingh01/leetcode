class Solution {
    public int maxSubArray(int[] nums) {
        // int maxsf=0;
        // int max=0;
        // for(int i=0; i<nums.length; i++){
        //     max=max+nums[i];
        //     if(max<maxsf){
        //         maxsf=max;
        //     }
        //     if(max<0){
        //         max=0;
        //     }
        // }
        // return maxsf;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
 
        for (int i = 0; i < nums.length; i++)
        {
            max_ending_here = max_ending_here + nums[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }
}