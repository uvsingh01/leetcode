class Solution {
    public int findKthLargest(int[] nums, int k) {
        mergesort(nums,0,nums.length-1);
        return nums[nums.length-k];
    }
    static void mergesort(int[]arr, int start, int end){
        if(start<end){
            int mid=start+(end-start)/2;
            mergesort(arr,start,mid);
            mergesort(arr,mid+1,end);
            merger(arr,start,mid,end);
        }
    }
    static void merger(int[]arr, int start, int mid ,int end){
        int m = mid-start+1;
        int n = end-mid;
        int a[]=new int[m];
        int b[]=new int[n];
        int k=0;
        for (int i = start; i <=mid ; i++) {
            a[k++]=arr[i];
        }
        k=0;
        for (int i = mid+1; i <=end ; i++) {
            b[k++]=arr[i];
        }
        int i=0; int j=0; k=start;
        while(i<m && j<n){
            if(a[i]<b[j]){
                arr[k++]=a[i++];
            }
            else{
                arr[k++]=b[j++];
            }
        }
        while(i<m){
            arr[k++]=a[i++];
        }
        while(j<n){
            arr[k++]=b[j++];
        }
    }
}