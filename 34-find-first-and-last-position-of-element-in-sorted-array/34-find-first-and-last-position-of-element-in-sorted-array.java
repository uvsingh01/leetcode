class Solution {
    public int[] searchRange(int[] arr, int target) {
        int [] ar=new int[2];
        ar[0]=search(arr,target,true);
        ar[1]=search(arr,target,false);
        return ar;
    }
    public int search(int[] arr, int target, boolean b){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                ans=mid;
                if(b){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}