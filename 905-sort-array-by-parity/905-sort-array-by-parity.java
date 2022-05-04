class Solution {
    public int[] sortArrayByParity(int[] nums) {
       int j = nums.length;

        int l = 0;

        int[] result = new int[j];

        for(int i=0; i<nums.length; i++){

            if(nums[i]%2 == 0){

                result[l] =nums[i];

                l++;

            }else {

                result[--j] = nums[i];
            }

        }

        return result;
    }
}