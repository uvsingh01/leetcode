class Solution {
    public int[] shuffle(int[] nums, int n) {
        int []arr= new int[2*n];
        int j=0;
        for(int i=0; i<nums.length/2; i++){
            arr[j++]=nums[i];
            arr[j++]=nums[i+n];
        }
        return arr;
    }
}