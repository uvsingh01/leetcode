class Solution {
    public int[] sortArray(int[] nums) {
        for(int i=1 ; i<nums.length; i++){
            int largest=nums[i];
            int j;
            for(j=i;j>0 && nums[j-1]> largest; j--){
                nums[j]=nums[j-1];
            }
            nums[j]=largest;
        }
        return nums;
    }
}