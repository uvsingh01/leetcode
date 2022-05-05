class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean Asc = false;
        // boolean b= true;
        if(nums[0]<nums[nums.length-1]){
            Asc=true;
        }
        for(int i=0; i<nums.length-1; i++){
            if(Asc){
                if(nums[i]>nums[i+1]){
                    return false;
                }
            }
            else{
                if(nums[i]<nums[i+1]){
                    return false;
                }
            }
        }
        return true;
    }
}