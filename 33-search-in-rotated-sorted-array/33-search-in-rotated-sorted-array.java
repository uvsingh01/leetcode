class Solution {
    public int search(int[] nums, int target) {
        // int pivot = peak(arr);
        // if(arr[0]>=target){
        //     binarysearch(arr,0,pivot, target);
        // }
        // else{
        //     binarysearch(arr,pivot+1,arr.length-1, target);
        // }
        // return -1;
        int low = 0;
        int high = nums.length - 1;
        while(high >= low) {
            int mid = low + (high - low) / 2;
            if(nums[mid] == target)
                return mid;
            if(nums[mid] >= nums[low]) {
                //left part is sorted
                if (target >= nums[low] && target < nums[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            }
            else {
                //right part is sorted
                if(target > nums[mid] && target <= nums[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }
}
//      public int binarysearch(int [] arr, int start, int end, int target){
//         while(start<=end){
//             int mid=start+(end-start)/2;
//             if(arr[mid]==target){
//                return mid;
//             }
//             else if(arr[mid]<target){
//                 start=mid+1;
//             }
//             else{
//                 end=mid;
//             }
//         }
//         return -1;
//     }
// public int peak(int []arr){
//         if(arr.length==1){
//             return 0;
//         }
//         int start=0;
//         int end = arr.length-1;
//         while(start<end){
//             int mid=start+(end-start)/2;
//             if(arr[mid]>arr[mid+1] && mid<end){
//                 return mid;
//             }
//             if(arr[mid]<arr[mid-1] && start<mid){
//                 return mid-1;
//             }
//             if(arr[mid]<=arr[start]){
//                 end=mid-1;
//             }
//             else{
//                 start=mid+1;
//             }
//         return -1;
//     }