class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] array=new int[2];
        for(int i=0; i<nums.length-1; i++){
            for(int j=1; j<nums.length;  j++ ){
                int x= nums[i]+nums[j]; //nums = [2,7,11,15], target = 9
                                                //0 1  2  3
                if(x==target && i!=j){
                    array[0]=i;
                    array[1]=j;
                }
            }
        }
        return array;
    }
}