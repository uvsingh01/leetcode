class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int arr[]=new int[2];
        // int start =0;
        // int end = nums.length -1;
        // int temp=0;
        // Arrays.sort(nums);
        // while(target!=temp){
        //     temp=0;
        //     temp=nums[start]+nums[end];
        //     if(temp>target){
        //         end--;
        //     }
        //     else{
        //         start++;
        //     }
        // }
        // arr[0]=start;
        // arr[1]=end;
        // return arr;
        HashMap<Integer,Integer> hm = new HashMap<>();
        int [] arr = new int[2];
        for(int i=0; i<nums.length; i++){
            if(hm.containsKey(target-nums[i])){
                arr[0]=hm.get(target-nums[i]);
                arr[1]=i;
            }
            else{
                hm.put(nums[i],i);
            }
        }
        return arr;
    }
}