class Solution {
    public void sortColors(int[] nums) {
        // int countr=0;
        // int countw=0;
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i]==0){
        //         countr=countr+1;
        //     }
        //     if(nums[i]==1){
        //         countw=countw+1;
        //     }
        // }
        // for(int i=0; i<countr; i++){
        //     nums[i]=0;
        // }
        // for(int j=countr; j<countr+countw; j++){
        //     nums[j]=1;
        // }
        // for(int k=countr+countw; k<nums.length; k++){
        //     nums[k]=2;
        // }
        int start=0;
        int mid =0;
        int end = nums.length-1;
        while(mid<=end){
            switch(nums[mid]){
                case 0:{
                    swap(nums,start,mid);
                    start++;
                    mid++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    swap(nums, mid,end);
                    end--;
                    break;
                }
                    
            }
        }
        
    }
    public void swap(int []arr, int i, int j){
        if(i==j){
            return;
        }
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
}