class Solution {
    public int[] sortArray(int[] nums) {
        qs(nums,0,nums.length-1);
        return nums;
    }
    public void qs(int[] a, int low, int high){
       if(low<high){
           int pivot= partition(a,low,high);
           qs(a,low,pivot-1);
           qs(a,pivot+1, high);
       }
    }
    public int partition(int [] a, int low, int high){
        int pivot= a[high];
        int i=(low);
        for(int j=low; j<high; j++){
            if(a[j]<pivot){

                swap(a, i, j);
                i++;
            }
        }
        swap(a, i, high);
        return (i);
    }
    public void swap(int []arr, int i, int j){
        if(i==j){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }
    public void ms(int []a, int low, int high){
        if(low<high){
            int mid = low+(high-low)/2;
            qs(a,low,mid);
            qs(a,mid+1, high);
            msm(a,low,mid, high);
        }
    }
    static void msm(int [] arr, int low, int mid, int high){
        int n = mid-low+1;
        int m = high-mid;
        int[] a = new int[n];
        int [] b = new int[m];
        int k=0;
        for(int i=low; i<=mid; i++) {
            a[k] = arr[i];
            k++;
        }
        k=0;
        for(int j=mid+1; j<=high; j++) {
            b[k]=arr[j];
            k++;
        }
        k=low;
        int i=0;
        int j=0;
        while(i<n && j<m){
            if(a[i]<b[j]){
                arr[k]= a[i];
                k++;
                i++;
            }
            else{
                arr[k]=b[j];
                k++;
                j++;
            }
        }
        while(i<n){
            arr[k]= a[i];
            k++;
            i++;
        }
        while(j<m){
            arr[k]= b[j];
            k++;
            j++;
        }
    }
}